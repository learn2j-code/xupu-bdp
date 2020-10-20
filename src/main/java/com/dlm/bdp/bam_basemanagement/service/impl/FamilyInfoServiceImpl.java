package com.dlm.bdp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.bdp.bam_basemanagement.service.FamilyInfoService;
import com.dlm.bdp.bam_basemanagement.service.FamilySettingService;
import com.dlm.bdp.bam_basemanagement.vo.FamilyInfoExtends;
import com.dlm.bdp.mapper.FamilyInfoMapper;
import com.dlm.bdp.pojo.FamilyInfo;
import com.dlm.bdp.pojo.FamilyInfoExample;
import com.dlm.bdp.pojo.FamilyInfoExample.Criteria;
import com.dlm.bdp.pojo.FamilyInfoWithBLOBs;
import com.dlm.bdp.pojo.FamilySetting;

@Service
public class FamilyInfoServiceImpl implements FamilyInfoService {
	@Autowired
	FamilyInfoMapper mapper;
	@Autowired
	FamilySettingService familySettingService;
	@Override
	public List<FamilyInfo> list() {
		FamilyInfoExample example = new FamilyInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FamilyInfoWithBLOBs record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FamilyInfoWithBLOBs record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FamilyInfoWithBLOBs get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FamilyInfo> findListByCondition(FamilyInfo condition) {
		FamilyInfoExample example = new FamilyInfoExample();
		example.setOrderByClause("id desc");
		if(condition!=null) {
			Criteria criteria = example.createCriteria();
			if(condition.getSurnameId()!=null&&condition.getSurnameId()!=0) {
				criteria.andSurnameIdEqualTo(condition.getSurnameId());
			}
			if(StringUtils.isNotBlank(condition.getFamilyName())) {
				criteria.andFamilyNameLike(condition.getFamilyName()+"%");
			}
		}
		return mapper.selectByExample(example);
	}

	@Override
	public FamilyInfoExtends packExtendsFrom(FamilyInfo record) {
		FamilyInfoExtends oneExtends = new FamilyInfoExtends();
		BeanUtils.copyProperties(record, oneExtends);
		FamilySetting familySetting = familySettingService.findFamilySettingByFamilyId(record.getId());
		if(familySetting!=null) {
			oneExtends.setEachCost(familySetting.getEachCost());
			oneExtends.setPaymentWay(familySetting.getPaymentWay());
		}
		return oneExtends;
	}

	@Override
	public List<FamilyInfoExtends> packExtendsListFrom(List<FamilyInfo> list) {
		List<FamilyInfoExtends> extendsList = new ArrayList<FamilyInfoExtends>();
		for(FamilyInfo familyInfo:list) {
			FamilyInfoExtends oneExtends = packExtendsFrom(familyInfo);
			extendsList.add(oneExtends);
		}
		return extendsList;
	}

}
