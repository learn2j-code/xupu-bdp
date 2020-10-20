package com.dlm.bdp.bam_basemanagement.service;

import java.util.List;

import com.dlm.bdp.bam_basemanagement.vo.FamilyInfoExtends;
import com.dlm.bdp.pojo.FamilyInfo;
import com.dlm.bdp.pojo.FamilyInfoWithBLOBs;

public interface FamilyInfoService {
	List<FamilyInfo> list();
	void add(FamilyInfoWithBLOBs record);
	void update(FamilyInfoWithBLOBs record);
	void delete(int id);
	FamilyInfoWithBLOBs get(int id);
	//根据条件查询家族
	List<FamilyInfo> findListByCondition(FamilyInfo condition);
	
	FamilyInfoExtends packExtendsFrom(FamilyInfo record);
	List<FamilyInfoExtends> packExtendsListFrom(List<FamilyInfo> list);
}
