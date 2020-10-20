package com.dlm.bdp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.bdp.bam_basemanagement.service.AreaInfoService;
import com.dlm.bdp.mapper.AreaInfoMapper;
import com.dlm.bdp.pojo.AreaInfo;
import com.dlm.bdp.pojo.AreaInfoExample;
import com.dlm.bdp.pojo.AreaInfoExample.Criteria;
import com.github.pagehelper.util.StringUtil;

@Service
public class AreaInfoServiceImpl implements AreaInfoService {
	@Autowired
	AreaInfoMapper mapper;

	@Override
	public List<AreaInfo> list() {
		AreaInfoExample example = new AreaInfoExample();
		example.setOrderByClause("area_id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(AreaInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(AreaInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public AreaInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<AreaInfo> findAreaInfoListByParentId(Integer parentId) {
		AreaInfoExample example = new AreaInfoExample();
		example.setOrderByClause("code_id asc");
		example.createCriteria().andParentIdEqualTo(parentId);
		return mapper.selectByExample(example);
	}

	@Override
	public List<AreaInfo> findAreaInfoListByAreaName(String areaName) {
		AreaInfoExample example = new AreaInfoExample();
		example.setOrderByClause("code_id asc");
		Criteria criteria = example.createCriteria();
		if(StringUtil.isNotEmpty(areaName)) {
			criteria.andAreaNameLike("%"+areaName+"%");
		}
		return mapper.selectByExample(example);
	}

	@Override
	public AreaInfo findAreaInfoByCodeId(Integer codeId) {
		AreaInfoExample example = new AreaInfoExample();
		example.createCriteria().andCodeIdEqualTo(codeId);
		List<AreaInfo> areaList =  mapper.selectByExample(example);
		AreaInfo areaInfo = areaList.size()>0?areaList.get(0):null;
		return areaInfo;
	}
}
