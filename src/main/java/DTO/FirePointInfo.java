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

public class FirePointInfo {

	public FirePointInfo() {
		super();
	}

	protected long FirePointId;

	public long getFirePointId() {
		return FirePointId;
	}

	public void setFirePointId(long FirePointId) {
		this.FirePointId = FirePointId;
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

	protected boolean active;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String warningMan;

	public String getWarningMan() {
		return warningMan;
	}

	public void setWarningMan(String warningMan) {
		this.warningMan = warningMan;
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

	protected String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	protected String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
	protected Date warningDate;

	public Date getWarningDate() {
		return warningDate;
	}

	public void setWarningDate(Date warningDate) {
		this.warningDate = warningDate;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
	protected Date startDate;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
	protected Date endDate;

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	protected String reason;

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	protected long damageEstimate;

	public long getDamageEstimate() {
		return damageEstimate;
	}

	public void setDamageEstimate(long damageEstimate) {
		this.damageEstimate = damageEstimate;
	}

	protected long dieNumber;

	public long getDieNumber() {
		return dieNumber;
	}

	public void setDieNumber(long dieNumber) {
		this.dieNumber = dieNumber;
	}

	protected long injuredNumber;

	public long getInjuredNumber() {
		return injuredNumber;
	}

	public void setInjuredNumber(long injuredNumber) {
		this.injuredNumber = injuredNumber;
	}

	protected long fireFighterNumbner;

	public long getFireFighterNumbner() {
		return fireFighterNumbner;
	}

	public void setFireFighterNumbner(long fireFighterNumbner) {
		this.fireFighterNumbner = fireFighterNumbner;
	}

	protected String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	protected String lat_;

	public String getLat_() {
		return lat_;
	}

	public void setLat_(String lat_) {
		this.lat_ = lat_;
	}

	protected String long_;

	public String getLong_() {
		return long_;
	}

	public void setLong_(String long_) {
		this.long_ = long_;
	}

	protected String fireSource;

	public String getFireSource() {
		return fireSource;
	}

	public void setFireSource(String fireSource) {
		this.fireSource = fireSource;
	}

	protected String fireOrExplode;

	public String getFireOrExplode() {
		return fireOrExplode;
	}

	public void setFireOrExplode(String fireOrExplode) {
		this.fireOrExplode = fireOrExplode;
	}

	protected String causeError;

	public String getCauseError() {
		return causeError;
	}

	public void setCauseError(String causeError) {
		this.causeError = causeError;
	}

	protected String fireArea;

	public String getFireArea() {
		return fireArea;
	}

	public void setFireArea(String fireArea) {
		this.fireArea = fireArea;
	}

	protected String deviceImei;

	public String getDeviceImei() {
		return deviceImei;
	}

	public void setDeviceImei(String deviceImei) {
		this.deviceImei = deviceImei;
	}

	protected long sensorId;

	public long getSensorId() {
		return sensorId;
	}

	public void setSensorId(long sensorId) {
		this.sensorId = sensorId;
	}

	protected long nextSensor;

	public long getNextSensor() {
		return nextSensor;
	}

	public void setNextSensor(long nextSensor) {
		this.nextSensor = nextSensor;
	}

	protected long builderId;

	public long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(long builderId) {
		this.builderId = builderId;
	}

	protected long provinceId;

	public long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(long provinceId) {
		this.provinceId = provinceId;
	}

	protected long districtId;

	public long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(long districtId) {
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