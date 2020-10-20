package com.dlm.bdp.bam_basemanagement.vo;

import com.dlm.bdp.pojo.FamilyInfo;

public class FamilyInfoExtends extends FamilyInfo{
	private String eachCost;
	private Integer paymentWay;
	public String getEachCost() {
		return eachCost;
	}

	public void setEachCost(String eachCost) {
		this.eachCost = eachCost;
	}

	public Integer getPaymentWay() {
		return paymentWay;
	}

	public void setPaymentWay(Integer paymentWay) {
		this.paymentWay = paymentWay;
	}
}
