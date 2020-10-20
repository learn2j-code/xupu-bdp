package com.dlm.bdp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.bdp.bam_basemanagement.service.NodeContentService;
import com.dlm.bdp.bam_basemanagement.service.NodeService;
import com.dlm.bdp.bam_basemanagement.vo.NodeExtends;
import com.dlm.bdp.mapper.NodeMapper;
import com.dlm.bdp.pojo.Node;
import com.dlm.bdp.pojo.NodeContent;
import com.dlm.bdp.pojo.NodeContentWithBLOBs;
import com.dlm.bdp.pojo.NodeExample;
import com.dlm.bdp.pojo.NodeExample.Criteria;

@Service
public class NodeServiceImpl implements NodeService {
	@Autowired
	NodeMapper mapper;
	@Autowired
	NodeContentService nodeContentSerivce;

	@Override
	public List<Node> list() {
		NodeExample example = new NodeExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(Node record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Node record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Node get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Node> findListByCondition(Node condition) {
		NodeExample example = new NodeExample();
//		Criteria criteria = example.createCriteria();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public List<NodeExtends> packExtendsListBy(List<Node> list) {
		List<NodeExtends> nodeExtendsList = new ArrayList<NodeExtends>();
		for(Node node:list) {
			NodeExtends nodeExtends = packExtendsBy(node);
			nodeExtendsList.add(nodeExtends);
		}
		return nodeExtendsList;
	}

	@Override
	public NodeExtends packExtendsBy(Node record) {
		NodeExtends nodeExtends = new NodeExtends();
		BeanUtils.copyProperties(record, nodeExtends);
		NodeContentWithBLOBs condition = new NodeContentWithBLOBs();
		if(record.getId()!=null) {
			condition.setNodeId(record.getId());
			List<NodeContentWithBLOBs> nodeContentList = nodeContentSerivce.findListByCondition(condition);
			nodeExtends.setNodeContentList(nodeContentList);
		}
		return nodeExtends;
	}


}
