package com.millenniumitesp.report;

import DTO.CheckBuilderInfo;
import DTO.VehicleInfo;
import DTO.VehicleInfo;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.*;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.constraints.Null;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CheckBuilderService {

	private final Logger log = LoggerFactory.getLogger(CheckBuilderService.class);

	@Autowired
	public CheckBuilderService() {
	}

	public HttpEntity getReport(LocalDate date, String type) throws IOException {
		String reportName = "checkBuilderInfo_report";

		// Creating CheckBuilderInfo instance for testing purpose
		CheckBuilderInfo checkBuilderInfo = new CheckBuilderInfo();
		checkBuilderInfo.setCheckDecide("Application Engineering");
		//checkBuilderInfo.setImei("Millennium IT");
		//checkBuilderInfo.setNumberSign("30Y2-4894");
		checkBuilderInfo.setDescription("EAD");
		checkBuilderInfo.setCreateDate(new Date());
		checkBuilderInfo.setModifiedDate(new Date());
		
		// Creating CheckBuilderInfo instance for testing purpose
		CheckBuilderInfo checkBuilderInfo1 = new CheckBuilderInfo();
		checkBuilderInfo1.setCheckDecide("Application Engineering2");
		//checkBuilderInfo1.setImei("Millennium IT2");
		//checkBuilderInfo1.setNumberSign("30Y2-4894");
		checkBuilderInfo1.setDescription("EAD2");
		checkBuilderInfo1.setCreateDate(new Date());
		checkBuilderInfo1.setModifiedDate(new Date());

		
		CheckBuilderInfo checkBuilderInfo2 = new CheckBuilderInfo();
		checkBuilderInfo2.setCheckDecide("Application Engineering3");
		//checkBuilderInfo2.setImei("Millennium IT3");
		//checkBuilderInfo2.setNumberSign("30Y2-4894");
		checkBuilderInfo2.setDescription("EAD2");
		checkBuilderInfo2.setCreateDate(new Date());
		checkBuilderInfo2.setModifiedDate(new Date());
		
		List<CheckBuilderInfo> records = new ArrayList<CheckBuilderInfo>();
		records.add(checkBuilderInfo);
		records.add(checkBuilderInfo1);
		records.add(checkBuilderInfo2);
		// new jasper collection of CheckBuilderInfo
		JRBeanCollectionDataSource jasperRecordsDataSource = new JRBeanCollectionDataSource(records);

		// jasper report implementation
		InputStream employeeReportStream = getClass().getResourceAsStream("/CheckBuilderInfoTemp.jrxml");
		try {
			JasperReport jasperReport = JasperCompileManager.compileReport(employeeReportStream);
			// JRSaver.saveObject(jasperReport, "ReportTemplate.jasper");

			// populating some required data
			Map<String, Object> parameters = new HashMap<>();
			parameters.put("fromDate", new Date());
			parameters.put("toDate", new Date());
			parameters.put("provinceName", "HN");
			parameters.put("districtName", "HĐ");
			parameters.put("jasperRecordsDataSource", jasperRecordsDataSource);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

			// web view
			HttpHeaders header = new HttpHeaders();
			final byte[] data;

			switch (type) {
			case "pdf":
				// exporting pdf
				JRPdfExporter exporterPDF = new JRPdfExporter();

				exporterPDF.setExporterInput(new SimpleExporterInput(jasperPrint));
				exporterPDF.setExporterOutput(new SimpleOutputStreamExporterOutput(reportName + ".pdf"));

				SimplePdfReportConfiguration reportConfigPDF = new SimplePdfReportConfiguration();
				reportConfigPDF.setSizePageToContent(true);
				reportConfigPDF.setForceLineBreakPolicy(false);

				SimplePdfExporterConfiguration exportConfig = new SimplePdfExporterConfiguration();
				exportConfig.setMetadataAuthor("Millennium IoT");
				exportConfig.setEncrypted(true);
				exportConfig.setAllowedPermissionsHint("PRINTING");

				exporterPDF.setConfiguration(reportConfigPDF);
				exporterPDF.setConfiguration(exportConfig);

				exporterPDF.exportReport();
				log.info("REPORT : PDF File sent to Report Folder");

				// exporting data to web browser
				data = JasperExportManager.exportReportToPdf(jasperPrint);

				header.setContentType(MediaType.APPLICATION_PDF);
				header.set(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=" + reportName + "pdf");
				header.setContentLength(data.length);

				log.info("REPORT : " + reportName + " PDF File sent to web browser");

				break;
			case "xlsx":
				JRXlsxExporter exporterXLS = new JRXlsxExporter();

				exporterXLS.setExporterInput(new SimpleExporterInput(jasperPrint));
				exporterXLS.setExporterOutput(new SimpleOutputStreamExporterOutput(reportName + ".xlsx"));

				SimpleXlsxReportConfiguration reportConfigXLS = new SimpleXlsxReportConfiguration();
				reportConfigXLS.setSheetNames(new String[] { "Daily Report Data" });

				exporterXLS.setConfiguration(reportConfigXLS);
				exporterXLS.exportReport();

				log.info("REPORT : " + reportName + " EXCEL File sent to Report Folder");

				// sending excel file to browser
				JRXlsxExporter xlsxExporter = new JRXlsxExporter();
				final byte[] rawBytes;

				try (ByteArrayOutputStream xlsReport = new ByteArrayOutputStream()) {
					xlsxExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
					xlsxExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(xlsReport));
					xlsxExporter.exportReport();

					rawBytes = xlsReport.toByteArray();
				}
				data = rawBytes;
				header.setContentType(
						MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
				header.set(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=" + reportName + ".xlsx");
				header.setContentLength(data.length);

				log.info("REPORT : " + reportName + " EXCEL File sent to web browser");

				break;

			case "csv":
				// creating csv file
				JRCsvExporter exporterCSV = new JRCsvExporter();

				exporterCSV.setExporterInput(new SimpleExporterInput(jasperPrint));
				exporterCSV.setExporterOutput(new SimpleWriterExporterOutput("Reports/" + reportName + ".csv"));

				exporterCSV.exportReport();

				log.info("REPORT : " + reportName + "CSV File sent to Report Folder");

				// sending PDF to browser : why? No csv view support for browser : need to
				// research more !
				data = JasperExportManager.exportReportToPdf(jasperPrint);

				header.setContentType(MediaType.APPLICATION_PDF);
				header.set(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=" + reportName + ".pdf");
				header.setContentLength(data.length);

				log.info("REPORT : " + reportName + " PDF File sent to web browser");
				break;
			default:
				data = JasperExportManager.exportReportToPdf(jasperPrint);
				header.setContentType(MediaType.APPLICATION_PDF);
				header.set(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=" + reportName + ".pdf");
				header.setContentLength(data.length);
				log.info("REPORT : No File Created , " + reportName + " PDF sent to browser.");
				break;
			}

			return new HttpEntity<byte[]>(data, header);
		} catch (JRException e) {
			e.printStackTrace();
			log.error(e.getMessage());

			HttpHeaders header = new HttpHeaders();
			header.setContentType(MediaType.APPLICATION_PDF);
			header.set(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=" + reportName + ".pdf");
			header.setContentLength(10);

			log.error("REPORT : No File Created , empty PDF sent to browser.");
			return new HttpEntity<byte[]>(header);
		}
	}
}
