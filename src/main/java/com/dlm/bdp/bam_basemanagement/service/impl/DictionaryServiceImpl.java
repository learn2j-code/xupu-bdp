package com.dlm.bdp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.bdp.bam_basemanagement.service.DictionaryService;
import com.dlm.bdp.mapper.DictionaryMapper;
import com.dlm.bdp.pojo.Dictionary;
import com.dlm.bdp.pojo.DictionaryExample;
import com.dlm.bdp.pojo.DictionaryExample.Criteria;

@Service
public class DictionaryServiceImpl implements DictionaryService {
	@Autowired
	DictionaryMapper mapper;

	@Override
	public List<Dictionary> list() {
		DictionaryExample example = new DictionaryExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(Dictionary record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Dictionary record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Dictionary get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Dictionary> findListByCondition(Dictionary condition) {
		DictionaryExample example = new DictionaryExample();
//		Criteria criteria = example.createCriteria();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}




}
