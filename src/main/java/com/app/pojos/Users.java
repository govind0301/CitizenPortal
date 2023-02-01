package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@IdClass(UserId.class)
@Table(name="t_cs_citizen_login_info")
public class Users {
	@Id
	@Column(name="APPLICANT_NUM")
	public Integer applicantNum;
	@Id
	@Column(name="LANG_CD")
	public Integer langCd;
	
	@Column(name="REG_YEAR")
	public Integer regYear;
	
	@Column(name="APPLICANT_SRNO")
	public Integer applicantSrno;
	
	@Column(name="FIRST_NAME",nullable=false)
	public String firstName;
	
	@Column(name="MIDDLE_NAME")
	public String middleName;
	
	@Column(name="LAST_NAME")
	public String lastName;
	
	@Column(name="LOGIN_ID")
	public String loginId;
	
	@Column(name="LOGIN_PASSWORD")
	public String loginPassword;
	
	@Column(name="SECURITY_QUES_CD1")
	public Integer securityQuesCd1;
	
	@Column(name="SECURITY_ANSWER1")
	public String securityAnswer1;
	
	@Column(name="SECURITY_QUES_CD2")
	public Integer securityQuesCd2;
	
	@Column(name="SECURITY_ANSWER2")
	public String securityAnswer2;
	
	@Column(name="PASSWORD_STATUS")
	public String passwordStatus;
	
	@Column(name="PRESENT_ADDR_CD")
	public Integer presentAddrCd;
	
	@Column(name="PERMANENT_ADDR_CD")
	public Integer permanentAddrCd;
	
	@Column(name="GENDER")
	public Integer gender;
	
	@Column(name="MOBILE_1")
	public Integer mobile1;
	
	@Column(name="MOBILE_2")
	public Integer mobile2;
	
	@Column(name="TELEPHONE")
	public String telephone;
	
	@Column(name="EMAIL")
	public String email;
	
	@Column(name="DOB")
	public LocalDate dob;
	
	@Column(name="NATIONAL_ID_TYPE")
	public Integer nationalIdType;
	
	@Column(name="NATIONAL_ID_NUM")
	public String nationalIdNum;
	
	@Column(name="IS_APPL_CRIMINAL")
	public String isApplCriminal;
	
	@Column(name="APPL_CRIMINAL_DETAIL")
	public String applCriminalDetail;
	
	@Column(name="IS_APPL_CONVICT")
	public String isApplConvict;
	@Column(name="APPL_CONVICT_DETAIL")
	public String applConvictDetail;
	
	@Column(name="ANY_LINK_BAN_ORGNZ")
	public String anyLinkBanOrgnz;
	
	@Column(name="LINK_BAN_ORGNZ_DETAIL")
	public String linkBanOrgnzDetail;
	
	@Column(name="APPL_PREVENTIVE_DET")
	public String applPreventiveDet;
	
	@Column(name="APPL_BLACKLIST_DETAILS")
	public String applBlacklistDetails;
	
	@Column(name="IS_PS_KNOWN")
	public String isPsKnown;
	
	@Column(name="IS_DISTRICT_KNOWN")
	public String isDistrictKnown;
	
	@Column(name="RECORD_STATUS")
	public String recordStatus;
	
	@Column(name="RECORD_CREATED_ON")
	public LocalDate recordCreatedOn;
	
	@Column(name="RECORD_CREATED_BY")
	public String recordCreatedBy;
	
	@Column(name="RECORD_UPDATED_ON")
	public LocalDate recordUpdatedOn;
	
	@Column(name="RECORD_UPDATED_BY")
    public String recordUpdatedBy;
	
	@Column(name="RECORD_SYNC_FROM")
    public String recordSyncFrom;
	
	@Column(name="RECORD_SYNC_TO")
    public String recordSyncTo;
	
	@Column(name="RECORD_SYNC_ON")
    public LocalDate recordSyncOn;
	
	@Column(name="RECORD_UPDATED_FROM")
    public String recordUpdatedFrom;
	
	@Column(name="ORIGINAL_RECORD")
    public Integer originalRecord;
	
	@Column(name="FULL_NAME")
    public String fullName;
	
	@Column(name="AgeMonths")
	public int AgeMonths;
	
	@Column(name="Age")   
	public int Age;
	
	@Column(name="YOB")     
	public int YOB;
	
	@Column(name="AgeFromYrs")     
	public int AgeFromYrs;
	
	@Column(name="AgeToYrs")    
	public int AgeToYrs;
	
	

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Users(Integer applicantNum, Integer langCd, Integer regYear, Integer applicantSrno, String firstName,
			String middleName, String lastName, String loginId, String loginPassword, Integer securityQuesCd1,
			String securityAnswer1, Integer securityQuesCd2, String securityAnswer2, String passwordStatus,
			Integer presentAddrCd, Integer permanentAddrCd, Integer gender, Integer mobile1, Integer mobile2,
			String telephone, String email, LocalDate dob, Integer nationalIdType, String nationalIdNum,
			String isApplCriminal, String applCriminalDetail, String isApplConvict, String applConvictDetail,
			String anyLinkBanOrgnz, String linkBanOrgnzDetail, String applPreventiveDet, String applBlacklistDetails,
			String isPsKnown, String isDistrictKnown, String recordStatus, LocalDate recordCreatedOn,
			String recordCreatedBy, LocalDate recordUpdatedOn, String recordUpdatedBy, String recordSyncFrom,
			String recordSyncTo, LocalDate recordSyncOn, String recordUpdatedFrom, Integer originalRecord,
			String fullName, int ageMonths, int age, int yOB, int ageFromYrs, int ageToYrs) {
		super();
		this.applicantNum = applicantNum;
		this.langCd = langCd;
		this.regYear = regYear;
		this.applicantSrno = applicantSrno;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.loginId = loginId;
		this.loginPassword = loginPassword;
		this.securityQuesCd1 = securityQuesCd1;
		this.securityAnswer1 = securityAnswer1;
		this.securityQuesCd2 = securityQuesCd2;
		this.securityAnswer2 = securityAnswer2;
		this.passwordStatus = passwordStatus;
		this.presentAddrCd = presentAddrCd;
		this.permanentAddrCd = permanentAddrCd;
		this.gender = gender;
		this.mobile1 = mobile1;
		this.mobile2 = mobile2;
		this.telephone = telephone;
		this.email = email;
		this.dob = dob;
		this.nationalIdType = nationalIdType;
		this.nationalIdNum = nationalIdNum;
		this.isApplCriminal = isApplCriminal;
		this.applCriminalDetail = applCriminalDetail;
		this.isApplConvict = isApplConvict;
		this.applConvictDetail = applConvictDetail;
		this.anyLinkBanOrgnz = anyLinkBanOrgnz;
		this.linkBanOrgnzDetail = linkBanOrgnzDetail;
		this.applPreventiveDet = applPreventiveDet;
		this.applBlacklistDetails = applBlacklistDetails;
		this.isPsKnown = isPsKnown;
		this.isDistrictKnown = isDistrictKnown;
		this.recordStatus = recordStatus;
		this.recordCreatedOn = recordCreatedOn;
		this.recordCreatedBy = recordCreatedBy;
		this.recordUpdatedOn = recordUpdatedOn;
		this.recordUpdatedBy = recordUpdatedBy;
		this.recordSyncFrom = recordSyncFrom;
		this.recordSyncTo = recordSyncTo;
		this.recordSyncOn = recordSyncOn;
		this.recordUpdatedFrom = recordUpdatedFrom;
		this.originalRecord = originalRecord;
		this.fullName = fullName;
		AgeMonths = ageMonths;
		Age = age;
		YOB = yOB;
		AgeFromYrs = ageFromYrs;
		AgeToYrs = ageToYrs;
	}
	
	
	public Integer getApplicantNum() {
		return applicantNum;
	}

	public void setApplicantNum(Integer applicantNum) {
		this.applicantNum = applicantNum;
	}

	public Integer getLangCd() {
		return langCd;
	}

	public void setLangCd(Integer langCd) {
		this.langCd = langCd;
	}

	public Integer getRegYear() {
		return regYear;
	}

	public void setRegYear(Integer regYear) {
		this.regYear = regYear;
	}

	public Integer getApplicantSrno() {
		return applicantSrno;
	}

	public void setApplicantSrno(Integer applicantSrno) {
		this.applicantSrno = applicantSrno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Integer getSecurityQuesCd1() {
		return securityQuesCd1;
	}

	public void setSecurityQuesCd1(Integer securityQuesCd1) {
		this.securityQuesCd1 = securityQuesCd1;
	}

	public String getSecurityAnswer1() {
		return securityAnswer1;
	}

	public void setSecurityAnswer1(String securityAnswer1) {
		this.securityAnswer1 = securityAnswer1;
	}

	public Integer getSecurityQuesCd2() {
		return securityQuesCd2;
	}

	public void setSecurityQuesCd2(Integer securityQuesCd2) {
		this.securityQuesCd2 = securityQuesCd2;
	}

	public String getSecurityAnswer2() {
		return securityAnswer2;
	}

	public void setSecurityAnswer2(String securityAnswer2) {
		this.securityAnswer2 = securityAnswer2;
	}

	public String getPasswordStatus() {
		return passwordStatus;
	}

	public void setPasswordStatus(String passwordStatus) {
		this.passwordStatus = passwordStatus;
	}

	public Integer getPresentAddrCd() {
		return presentAddrCd;
	}

	public void setPresentAddrCd(Integer presentAddrCd) {
		this.presentAddrCd = presentAddrCd;
	}

	public Integer getPermanentAddrCd() {
		return permanentAddrCd;
	}

	public void setPermanentAddrCd(Integer permanentAddrCd) {
		this.permanentAddrCd = permanentAddrCd;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getMobile1() {
		return mobile1;
	}

	public void setMobile1(Integer mobile1) {
		this.mobile1 = mobile1;
	}

	public Integer getMobile2() {
		return mobile2;
	}

	public void setMobile2(Integer mobile2) {
		this.mobile2 = mobile2;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getNationalIdType() {
		return nationalIdType;
	}

	public void setNationalIdType(Integer nationalIdType) {
		this.nationalIdType = nationalIdType;
	}

	public String getNationalIdNum() {
		return nationalIdNum;
	}

	public void setNationalIdNum(String nationalIdNum) {
		this.nationalIdNum = nationalIdNum;
	}

	public String getIsApplCriminal() {
		return isApplCriminal;
	}

	public void setIsApplCriminal(String isApplCriminal) {
		this.isApplCriminal = isApplCriminal;
	}

	public String getApplCriminalDetail() {
		return applCriminalDetail;
	}

	public void setApplCriminalDetail(String applCriminalDetail) {
		this.applCriminalDetail = applCriminalDetail;
	}

	public String getIsApplConvict() {
		return isApplConvict;
	}

	public void setIsApplConvict(String isApplConvict) {
		this.isApplConvict = isApplConvict;
	}

	public String getApplConvictDetail() {
		return applConvictDetail;
	}

	public void setApplConvictDetail(String applConvictDetail) {
		this.applConvictDetail = applConvictDetail;
	}

	public String getAnyLinkBanOrgnz() {
		return anyLinkBanOrgnz;
	}

	public void setAnyLinkBanOrgnz(String anyLinkBanOrgnz) {
		this.anyLinkBanOrgnz = anyLinkBanOrgnz;
	}

	public String getLinkBanOrgnzDetail() {
		return linkBanOrgnzDetail;
	}

	public void setLinkBanOrgnzDetail(String linkBanOrgnzDetail) {
		this.linkBanOrgnzDetail = linkBanOrgnzDetail;
	}

	public String getApplPreventiveDet() {
		return applPreventiveDet;
	}

	public void setApplPreventiveDet(String applPreventiveDet) {
		this.applPreventiveDet = applPreventiveDet;
	}

	public String getApplBlacklistDetails() {
		return applBlacklistDetails;
	}

	public void setApplBlacklistDetails(String applBlacklistDetails) {
		this.applBlacklistDetails = applBlacklistDetails;
	}

	public String getIsPsKnown() {
		return isPsKnown;
	}

	public void setIsPsKnown(String isPsKnown) {
		this.isPsKnown = isPsKnown;
	}

	public String getIsDistrictKnown() {
		return isDistrictKnown;
	}

	public void setIsDistrictKnown(String isDistrictKnown) {
		this.isDistrictKnown = isDistrictKnown;
	}

	public String getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	public LocalDate getRecordCreatedOn() {
		return recordCreatedOn;
	}

	public void setRecordCreatedOn(LocalDate recordCreatedOn) {
		this.recordCreatedOn = recordCreatedOn;
	}

	public String getRecordCreatedBy() {
		return recordCreatedBy;
	}

	public void setRecordCreatedBy(String recordCreatedBy) {
		this.recordCreatedBy = recordCreatedBy;
	}

	public LocalDate getRecordUpdatedOn() {
		return recordUpdatedOn;
	}

	public void setRecordUpdatedOn(LocalDate recordUpdatedOn) {
		this.recordUpdatedOn = recordUpdatedOn;
	}

	public String getRecordUpdatedBy() {
		return recordUpdatedBy;
	}

	public void setRecordUpdatedBy(String recordUpdatedBy) {
		this.recordUpdatedBy = recordUpdatedBy;
	}

	public String getRecordSyncFrom() {
		return recordSyncFrom;
	}

	public void setRecordSyncFrom(String recordSyncFrom) {
		this.recordSyncFrom = recordSyncFrom;
	}

	public String getRecordSyncTo() {
		return recordSyncTo;
	}

	public void setRecordSyncTo(String recordSyncTo) {
		this.recordSyncTo = recordSyncTo;
	}

	public LocalDate getRecordSyncOn() {
		return recordSyncOn;
	}

	public void setRecordSyncOn(LocalDate recordSyncOn) {
		this.recordSyncOn = recordSyncOn;
	}

	public String getRecordUpdatedFrom() {
		return recordUpdatedFrom;
	}

	public void setRecordUpdatedFrom(String recordUpdatedFrom) {
		this.recordUpdatedFrom = recordUpdatedFrom;
	}

	public Integer getOriginalRecord() {
		return originalRecord;
	}

	public void setOriginalRecord(Integer originalRecord) {
		this.originalRecord = originalRecord;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAgeMonths() {
		return AgeMonths;
	}

	public void setAgeMonths(int ageMonths) {
		AgeMonths = ageMonths;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getYOB() {
		return YOB;
	}

	public void setYOB(int yOB) {
		YOB = yOB;
	}

	public int getAgeFromYrs() {
		return AgeFromYrs;
	}

	public void setAgeFromYrs(int ageFromYrs) {
		AgeFromYrs = ageFromYrs;
	}

	public int getAgeToYrs() {
		return AgeToYrs;
	}

	public void setAgeToYrs(int ageToYrs) {
		AgeToYrs = ageToYrs;
	}


	@Override
	public String toString() {
		return "Users [applicantNum=" + applicantNum + ", langCd=" + langCd + ", regYear=" + regYear
				+ ", applicantSrno=" + applicantSrno + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", loginId=" + loginId + ", loginPassword=" + loginPassword
				+ ", securityQuesCd1=" + securityQuesCd1 + ", securityAnswer1=" + securityAnswer1 + ", securityQuesCd2="
				+ securityQuesCd2 + ", securityAnswer2=" + securityAnswer2 + ", passwordStatus=" + passwordStatus
				+ ", presentAddrCd=" + presentAddrCd + ", permanentAddrCd=" + permanentAddrCd + ", gender=" + gender
				+ ", mobile1=" + mobile1 + ", mobile2=" + mobile2 + ", telephone=" + telephone + ", email=" + email
				+ ", dob=" + dob + ", nationalIdType=" + nationalIdType + ", nationalIdNum=" + nationalIdNum
				+ ", isApplCriminal=" + isApplCriminal + ", applCriminalDetail=" + applCriminalDetail
				+ ", isApplConvict=" + isApplConvict + ", applConvictDetail=" + applConvictDetail + ", anyLinkBanOrgnz="
				+ anyLinkBanOrgnz + ", linkBanOrgnzDetail=" + linkBanOrgnzDetail + ", applPreventiveDet="
				+ applPreventiveDet + ", applBlacklistDetails=" + applBlacklistDetails + ", isPsKnown=" + isPsKnown
				+ ", isDistrictKnown=" + isDistrictKnown + ", recordStatus=" + recordStatus + ", recordCreatedOn="
				+ recordCreatedOn + ", recordCreatedBy=" + recordCreatedBy + ", recordUpdatedOn=" + recordUpdatedOn
				+ ", recordUpdatedBy=" + recordUpdatedBy + ", recordSyncFrom=" + recordSyncFrom + ", recordSyncTo="
				+ recordSyncTo + ", recordSyncOn=" + recordSyncOn + ", recordUpdatedFrom=" + recordUpdatedFrom
				+ ", originalRecord=" + originalRecord + ", fullName=" + fullName + ", AgeMonths=" + AgeMonths
				+ ", Age=" + Age + ", YOB=" + YOB + ", AgeFromYrs=" + AgeFromYrs + ", AgeToYrs=" + AgeToYrs + "]";
	}
	
	
}
