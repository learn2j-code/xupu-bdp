package com.dlm.bdp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlm.bdp.bam_basemanagement.service.FamilySettingService;
import com.dlm.bdp.bam_basemanagement.service.KeywordsConfigService;
import com.dlm.bdp.bam_basemanagement.service.TeletextCenterService;
import com.dlm.bdp.bam_basemanagement.service.TeletextInfoService;
import com.dlm.bdp.bam_basemanagement.service.TeletextTypeService;
import com.dlm.bdp.bam_basemanagement.vo.TeletextCenterExtends;
import com.dlm.bdp.mapper.FamilySettingMapper;
import com.dlm.bdp.mapper.KeywordsConfigMapper;
import com.dlm.bdp.mapper.TeletextCenterMapper;
import com.dlm.bdp.mapper.TeletextInfoMapper;
import com.dlm.bdp.mapper.TeletextTypeMapper;
import com.dlm.bdp.pojo.FamilySetting;
import com.dlm.bdp.pojo.FamilySettingExample;
import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.KeywordsConfigExample;
import com.dlm.bdp.pojo.TeletextCenter;
import com.dlm.bdp.pojo.TeletextCenterExample;
import com.dlm.bdp.pojo.TeletextCenterExample.Criteria;
import com.dlm.bdp.pojo.TeletextInfo;
import com.dlm.bdp.pojo.TeletextInfoExample;
import com.dlm.bdp.pojo.TeletextType;
import com.dlm.bdp.pojo.TeletextTypeExample;

@Service
public class TeletextCenterServiceImpl implements TeletextCenterService {
	@Autowired
	TeletextCenterMapper mapper;
	@Autowired
	TeletextTypeService teletextTypeService;
	@Autowired
	TeletextInfoService teletextInfoService;
	@Override
	public List<TeletextCenter> list() {
		TeletextCenterExample example = new TeletextCenterExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(TeletextCenter record) {
		mapper.insertSelective(record);
	}

	@Override
	@Transactional
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
		teletextInfoService.deleteTeletextInfoByCenterId(id);
	}

	@Override
	public void update(TeletextCenter record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public TeletextCenter get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TeletextCenter> findListByCondition(TeletextCenter condition) {
		TeletextCenterExample example = new TeletextCenterExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		if(condition.getTypeId()!=null) {
			criteria.andTypeIdEqualTo(condition.getTypeId());
		}
		if(StringUtils.isNotBlank(condition.getAuthor())) {
			criteria.andAuthorEqualTo(condition.getAuthor());
		}
		return mapper.selectByExample(example);
	}

	@Override
	public List<TeletextCenterExtends> packTeletextCenterExtendsList(List<TeletextCenter> list) {
		List<TeletextCenterExtends> teletextCenterExtendsList = new ArrayList<TeletextCenterExtends>();
		for(TeletextCenter teletextCenter:list) {
			TeletextCenterExtends teletextCenterExtends = new TeletextCenterExtends();
			BeanUtils.copyProperties(teletextCenter, teletextCenterExtends);
			TeletextType teletextType = teletextTypeService.get(teletextCenter.getTypeId());
			List<TeletextInfo> teletextInfoList = teletextInfoService.findTeletextInfoListByCenterId(teletextCenter.getId());
			teletextCenterExtends.setTeletextInfoList(teletextInfoList);
			teletextCenterExtends.setTeletextType(teletextType);
			teletextCenterExtendsList.add(teletextCenterExtends);
		}
		return teletextCenterExtendsList;
	}

	@Override
	@Transactional
	public void addTeletextCenterExtends(TeletextCenterExtends record) {
		add(record);
		List<TeletextInfo> teletextInfoList = record.getTeletextInfoList();
		for(TeletextInfo teletextInfo:teletextInfoList) {
			teletextInfo.setId(null);
			teletextInfo.setCenterId(record.getId());
			teletextInfoService.add(teletextInfo);
		}
	}

	@Override
	@Transactional
	public void updateTeletextCenterExtends(TeletextCenterExtends record) {
		update(record);
		teletextInfoService.deleteTeletextInfoByCenterId(record.getId());
		List<TeletextInfo> teletextInfoList = record.getTeletextInfoList();
		for(TeletextInfo teletextInfo:teletextInfoList) {
			teletextInfo.setId(null);
			teletextInfo.setCenterId(record.getId());
			teletextInfoService.add(teletextInfo);
		}
	}
}
