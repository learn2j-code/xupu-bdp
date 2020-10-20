package com.dlm.bdp.bam_basemanagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.bdp.bam_basemanagement.service.FamilySettingService;
import com.dlm.bdp.bam_basemanagement.service.KeywordsConfigService;
import com.dlm.bdp.bam_basemanagement.service.TeletextTypeService;
import com.dlm.bdp.mapper.FamilySettingMapper;
import com.dlm.bdp.mapper.KeywordsConfigMapper;
import com.dlm.bdp.mapper.TeletextTypeMapper;
import com.dlm.bdp.pojo.FamilySetting;
import com.dlm.bdp.pojo.FamilySettingExample;
import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.KeywordsConfigExample;
import com.dlm.bdp.pojo.TeletextType;
import com.dlm.bdp.pojo.TeletextTypeExample;

@Service
public class TeletextTypeServiceImpl implements TeletextTypeService {
	@Autowired
	TeletextTypeMapper mapper;

	@Override
	public List<TeletextType> list() {
		TeletextTypeExample example = new TeletextTypeExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(TeletextType record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(TeletextType record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public TeletextType get(int id) {
		return mapper.selectByPrimaryKey(id);
	}


}
