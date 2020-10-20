package com.dlm.bdp.bam_basemanagement.vo;

import com.dlm.bdp.pojo.AreaInfo;

public class AreaInfoExtends extends AreaInfo{
	private String parentAreaName;

	public String getParentAreaName() {
		return parentAreaName;
	}

	public void setParentAreaName(String parentAreaName) {
		this.parentAreaName = parentAreaName;
	}
}
