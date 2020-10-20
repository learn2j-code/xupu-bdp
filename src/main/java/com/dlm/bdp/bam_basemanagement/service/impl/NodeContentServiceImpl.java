package com.dlm.bdp.bam_basemanagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.bdp.bam_basemanagement.service.NodeContentService;
import com.dlm.bdp.mapper.NodeContentMapper;
import com.dlm.bdp.pojo.NodeContent;
import com.dlm.bdp.pojo.NodeContentExample;
import com.dlm.bdp.pojo.NodeContentExample.Criteria;
import com.dlm.bdp.pojo.NodeContentWithBLOBs;

@Service
public class NodeContentServiceImpl implements NodeContentService {
	@Autowired
	NodeContentMapper mapper;

	@Override
	public List<NodeContentWithBLOBs> list() {
		NodeContentExample example = new NodeContentExample();
		example.setOrderByClause("order_number desc, id asc");
		return mapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public void add(NodeContentWithBLOBs record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(NodeContentWithBLOBs record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public NodeContentWithBLOBs get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<NodeContentWithBLOBs> findListByCondition(NodeContentWithBLOBs condition) {
		NodeContentExample example = new NodeContentExample();
		Criteria criteria = example.createCriteria();
		example.setOrderByClause("order_number desc, id asc");
		if(condition.getNodeId()!=null) {
			criteria.andNodeIdEqualTo(condition.getNodeId());
		}
		return mapper.selectByExampleWithBLOBs(example);
	}


}
