package com.dlm.bdp.bam_basemanagement.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.bdp.bam_basemanagement.service.FamilyServiceService;
import com.dlm.bdp.bam_basemanagement.service.ServiceCenterService;
import com.dlm.bdp.mapper.FamilyServiceMapper;
import com.dlm.bdp.pojo.FamilyService;
import com.dlm.bdp.pojo.FamilyServiceExample;
import com.dlm.bdp.pojo.ServiceCenter;

@Service
public class FamilyServiceServiceImpl implements FamilyServiceService {
	@Autowired
	FamilyServiceMapper mapper;
	
	@Autowired
	ServiceCenterService serviceCenterService;
	@Override
	public List<FamilyService> list() {
		FamilyServiceExample example = new FamilyServiceExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FamilyService record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FamilyService record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FamilyService get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FamilyService> findServiceListByFamilyId(int familyId) {
		FamilyServiceExample example = new FamilyServiceExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyIdEqualTo(familyId);
		return mapper.selectByExample(example);
	}

	@Override
	public void addFamilyService(FamilyService record) {
		//添加家族的已购服务，计算价格和到期时间等
		Integer serviceId = record.getServiceId();
		ServiceCenter serviceCenter = serviceCenterService.get(serviceId);
		Double totalFee = Double.valueOf(serviceCenter.getPrice())*Double.valueOf(record.getBoughtNum());
		String serviceFee = String.format("%.3f", totalFee);
		record.setServiceFee(serviceFee);
		
		Date boughtTime = new Date();
		Date endTime = boughtTime;
		record.setBoughtTime(boughtTime);
		switch(Integer.valueOf(serviceCenter.getTimeUnit())) {
		case 1:
			endTime = DateUtils.addHours(boughtTime, record.getBoughtNum());
			break;
		case 2:
			endTime = DateUtils.addDays(boughtTime, record.getBoughtNum());
			break;
		case 3:
			endTime = DateUtils.addWeeks(boughtTime, record.getBoughtNum());
			break;
		case 4:
			endTime = DateUtils.addMonths(boughtTime, record.getBoughtNum());
			break;
		case 5:
			endTime = DateUtils.addMonths(boughtTime, record.getBoughtNum()*3);
			break;
		case 6:
			endTime = DateUtils.addYears(boughtTime, record.getBoughtNum());
			break;
		default:
			break;
		}
		record.setEndTime(endTime);
		add(record);
	}

}
