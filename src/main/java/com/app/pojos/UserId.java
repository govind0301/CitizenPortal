package com.app.pojos;

import java.io.Serializable;

public class UserId implements Serializable {
	private Integer applicantNum;
	private Integer langCd;
	
	public UserId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserId(Integer applicantNum, Integer langCd) {
		super();
		this.applicantNum = applicantNum;
		this.langCd = langCd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicantNum == null) ? 0 : applicantNum.hashCode());
		result = prime * result + ((langCd == null) ? 0 : langCd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserId other = (UserId) obj;
		if (applicantNum == null) {
			if (other.applicantNum != null)
				return false;
		} else if (!applicantNum.equals(other.applicantNum))
			return false;
		if (langCd == null) {
			if (other.langCd != null)
				return false;
		} else if (!langCd.equals(other.langCd))
			return false;
		return true;
	}
	
	
}
