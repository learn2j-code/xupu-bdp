package com.dlm.bdp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.bdp.bam_basemanagement.service.FamilySettingService;
import com.dlm.bdp.bam_basemanagement.service.KeywordsConfigService;
import com.dlm.bdp.bam_basemanagement.service.RelationshipCallService;
import com.dlm.bdp.bam_basemanagement.service.TeletextInfoService;
import com.dlm.bdp.bam_basemanagement.service.TeletextTypeService;
import com.dlm.bdp.mapper.FamilySettingMapper;
import com.dlm.bdp.mapper.KeywordsConfigMapper;
import com.dlm.bdp.mapper.RelationshipCallMapper;
import com.dlm.bdp.mapper.TeletextInfoMapper;
import com.dlm.bdp.mapper.TeletextTypeMapper;
import com.dlm.bdp.pojo.FamilySetting;
import com.dlm.bdp.pojo.FamilySettingExample;
import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.KeywordsConfigExample;
import com.dlm.bdp.pojo.RelationshipCall;
import com.dlm.bdp.pojo.RelationshipCallExample;
import com.dlm.bdp.pojo.RelationshipCallExample.Criteria;
import com.dlm.bdp.pojo.TeletextInfo;
import com.dlm.bdp.pojo.TeletextInfoExample;
import com.dlm.bdp.pojo.TeletextType;
import com.dlm.bdp.pojo.TeletextTypeExample;

@Service
public class RelationshipCallServiceImpl implements RelationshipCallService {
	@Autowired
	RelationshipCallMapper mapper;

	@Override
	public List<RelationshipCall> list() {
		RelationshipCallExample example = new RelationshipCallExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(RelationshipCall record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(RelationshipCall record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public RelationshipCall get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<RelationshipCall> findListByCondition(RelationshipCall condition) {
		RelationshipCallExample example = new RelationshipCallExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getCode())) {
			criteria.andCodeEqualTo(condition.getCode());
		}
		if(StringUtils.isNotBlank(condition.getGenerationLevel())) {
			criteria.andGenerationLevelEqualTo(condition.getGenerationLevel());
		}
		if(StringUtils.isNotBlank(condition.getPostCodes())) {
			criteria.andPostCodesEqualTo(condition.getPostCodes());
		}
		if(StringUtils.isNotBlank(condition.getRelationCode())) {
			criteria.andRelationCodeEqualTo(condition.getRelationCode());
		}
		if(StringUtils.isNotBlank(condition.getRelationCodecn())) {
			criteria.andRelationCodeEqualTo(condition.getRelationCodecn());
		}
		if(condition.getGenerationLevelCode()!=null) {
			criteria.andGenerationLevelCodeEqualTo(condition.getGenerationLevelCode());
		}
		if(condition.getGenderType()!=null) {
			criteria.andGenderTypeEqualTo(condition.getGenderType());
		}
		if(condition.getRelationType()!=null) {
			criteria.andRelationTypeEqualTo(condition.getRelationType());
		}
		return mapper.selectByExample(example);
	}
}
