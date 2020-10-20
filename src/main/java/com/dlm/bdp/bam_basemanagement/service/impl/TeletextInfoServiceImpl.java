package com.dlm.bdp.bam_basemanagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.bdp.bam_basemanagement.service.FamilySettingService;
import com.dlm.bdp.bam_basemanagement.service.KeywordsConfigService;
import com.dlm.bdp.bam_basemanagement.service.TeletextInfoService;
import com.dlm.bdp.bam_basemanagement.service.TeletextTypeService;
import com.dlm.bdp.mapper.FamilySettingMapper;
import com.dlm.bdp.mapper.KeywordsConfigMapper;
import com.dlm.bdp.mapper.TeletextInfoMapper;
import com.dlm.bdp.mapper.TeletextTypeMapper;
import com.dlm.bdp.pojo.FamilySetting;
import com.dlm.bdp.pojo.FamilySettingExample;
import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.KeywordsConfigExample;
import com.dlm.bdp.pojo.TeletextInfo;
import com.dlm.bdp.pojo.TeletextInfoExample;
import com.dlm.bdp.pojo.TeletextType;
import com.dlm.bdp.pojo.TeletextTypeExample;

@Service
public class TeletextInfoServiceImpl implements TeletextInfoService {
	@Autowired
	TeletextInfoMapper mapper;

	@Override
	public List<TeletextInfo> list() {
		TeletextInfoExample example = new TeletextInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(TeletextInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(TeletextInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public TeletextInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TeletextInfo> findTeletextInfoListByCenterId(Integer centerId) {
		TeletextInfoExample example = new TeletextInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andCenterIdEqualTo(centerId);
		return mapper.selectByExample(example);
	}

	@Override
	public void deleteTeletextInfoByCenterId(Integer centerId) {
		TeletextInfoExample example = new TeletextInfoExample();
		example.createCriteria().andCenterIdEqualTo(centerId);
		mapper.deleteByExample(example);
	}


}
