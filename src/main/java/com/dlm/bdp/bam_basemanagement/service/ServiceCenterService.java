package com.dlm.bdp.bam_basemanagement.service;

import java.util.List;

import com.dlm.bdp.pojo.ServiceCenter;

public interface ServiceCenterService {
	List<ServiceCenter> list();
	void add(ServiceCenter record);
	void update(ServiceCenter record);
	void delete(int id);
	ServiceCenter get(int id);
	
	void addServiceCenter(ServiceCenter record);
	List<ServiceCenter> findServiceCenterListByUseFlag(Integer useFlag);
}
