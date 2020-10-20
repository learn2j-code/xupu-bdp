package com.dlm.bdp.bam_basemanagement.service;

import java.util.List;

import com.dlm.bdp.pojo.FamilyService;

public interface FamilyServiceService {
	List<FamilyService> list();
	void add(FamilyService record);
	void update(FamilyService record);
	void delete(int id);
	FamilyService get(int id);
	
	void addFamilyService(FamilyService record);
	List<FamilyService> findServiceListByFamilyId(int familyId);
}
