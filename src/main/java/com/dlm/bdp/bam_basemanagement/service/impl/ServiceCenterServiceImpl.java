package com.dlm.bdp.bam_basemanagement.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.bdp.bam_basemanagement.service.AreaInfoService;
import com.dlm.bdp.bam_basemanagement.service.ServiceCenterService;
import com.dlm.bdp.mapper.AreaInfoMapper;
import com.dlm.bdp.mapper.ServiceCenterMapper;
import com.dlm.bdp.pojo.AreaInfo;
import com.dlm.bdp.pojo.AreaInfoExample;
import com.dlm.bdp.pojo.ServiceCenter;
import com.dlm.bdp.pojo.ServiceCenterExample;

@Service
public class ServiceCenterServiceImpl implements ServiceCenterService {
	@Autowired
	ServiceCenterMapper mapper;

	@Override
	public List<ServiceCenter> list() {
		ServiceCenterExample example = new ServiceCenterExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(ServiceCenter record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(ServiceCenter record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public ServiceCenter get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void addServiceCenter(ServiceCenter record) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String strDate = new SimpleDateFormat("yyyyMMdd").format(date);
		String strDateTime = new SimpleDateFormat("HHmmss").format(date);
		String serviceNo = "FS"+strDate+strDateTime;
		record.setServiceNo(serviceNo);
		add(record);
	}

	@Override
	public List<ServiceCenter> findServiceCenterListByUseFlag(Integer useFlag) {
		ServiceCenterExample example = new ServiceCenterExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andUseFlagEqualTo(useFlag);
		return mapper.selectByExample(example);
	}

}
