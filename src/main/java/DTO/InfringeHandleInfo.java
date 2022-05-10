/*
   Copyright (c) 2021-present zFANTASISTAz
*/

package DTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author HieuNN
 * @generated
 */

/*
 * NOTE FOR DEVELOPERS:
 *
 * Never modify or reference this class directly
 */
/*
*/

public class InfringeHandleInfo {

	public InfringeHandleInfo() {
		super();
	}

	protected long infringeHandleId;

	public long getInfringeHandleId() {
		return infringeHandleId;
	}

	public void setInfringeHandleId(long infringeHandleId) {
		this.infringeHandleId = infringeHandleId;
	}

	protected long groupId;

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	protected long companyId;

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	protected long userId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	protected String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
	protected Date createDate;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
	protected Date modifiedDate;

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	protected Boolean active;

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	protected Long infringeGroupId;

	public Long getInfringeGroupId() {
		return infringeGroupId;
	}

	public void setInfringeGroupId(Long infringeGroupId) {
		this.infringeGroupId = infringeGroupId;
	}

	protected String infringeGroupName;

	public String getInfringeGroupName() {
		return infringeGroupName;
	}

	public void setInfringeGroupName(String infringeGroupName) {
		this.infringeGroupName = infringeGroupName;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
	protected Date infringeDate;

	public Date getInfringeDate() {
		return infringeDate;
	}

	public void setInfringeDate(Date infringeDate) {
		this.infringeDate = infringeDate;
	}

	protected String infringeContent;

	public String getInfringeContent() {
		return infringeContent;
	}

	public void setInfringeContent(String infringeContent) {
		this.infringeContent = infringeContent;
	}

	protected String infringeObject;

	public String getInfringeObject() {
		return infringeObject;
	}

	public void setInfringeObject(String infringeObject) {
		this.infringeObject = infringeObject;
	}

	protected Boolean isWarning;

	public Boolean isIsWarning() {
		return isWarning;
	}

	public void setIsWarning(Boolean isWarning) {
		this.isWarning = isWarning;
	}

	protected double infringeAmount;

	public double getInfringeAmount() {
		return infringeAmount;
	}

	public void setInfringeAmount(double infringeAmount) {
		this.infringeAmount = infringeAmount;
	}

	protected Boolean isSuspended;

	public Boolean isIsSuspended() {
		return isSuspended;
	}

	public void setIsSuspended(Boolean isSuspended) {
		this.isSuspended = isSuspended;
	}

	protected Boolean isTempSuspended;

	public Boolean isIsTempSuspended() {
		return isTempSuspended;
	}

	public void setIsTempSuspended(Boolean isTempSuspended) {
		this.isTempSuspended = isTempSuspended;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
	protected Date tempSuspendedDate;

	public Date getTempSuspendedDate() {
		return tempSuspendedDate;
	}

	public void setTempSuspendedDate(Date tempSuspendedDate) {
		this.tempSuspendedDate = tempSuspendedDate;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
	protected Date tempSuspendedReactiveDate;

	public Date getTempSuspendedReactiveDate() {
		return tempSuspendedReactiveDate;
	}

	public void setTempSuspendedReactiveDate(Date tempSuspendedReactiveDate) {
		this.tempSuspendedReactiveDate = tempSuspendedReactiveDate;
	}

	protected String otherContent;

	public String getOtherContent() {
		return otherContent;
	}

	public void setOtherContent(String otherContent) {
		this.otherContent = otherContent;
	}

	protected Long checkedId;

	public Long getCheckedId() {
		return checkedId;
	}

	public void setCheckedId(Long checkedId) {
		this.checkedId = checkedId;
	}

	protected String properties;

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	protected String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	protected Long builderId;

	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}

	protected Long provinceId;

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	protected Long districtId;

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	protected String provinceName;

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	protected String districtName;

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	protected String builderName;

	public String getBuilderName() {
		return builderName;
	}

	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}

	
}