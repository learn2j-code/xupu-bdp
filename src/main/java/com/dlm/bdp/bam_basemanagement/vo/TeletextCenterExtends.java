package com.dlm.bdp.bam_basemanagement.vo;

import java.util.List;

import com.dlm.bdp.pojo.TeletextCenter;
import com.dlm.bdp.pojo.TeletextInfo;
import com.dlm.bdp.pojo.TeletextType;

public class TeletextCenterExtends extends TeletextCenter{
	private List<TeletextInfo> teletextInfoList;
	private TeletextType teletextType;
	public List<TeletextInfo> getTeletextInfoList() {
		return teletextInfoList;
	}
	public void setTeletextInfoList(List<TeletextInfo> teletextInfoList) {
		this.teletextInfoList = teletextInfoList;
	}
	public TeletextType getTeletextType() {
		return teletextType;
	}
	public void setTeletextType(TeletextType teletextType) {
		this.teletextType = teletextType;
	}
}
