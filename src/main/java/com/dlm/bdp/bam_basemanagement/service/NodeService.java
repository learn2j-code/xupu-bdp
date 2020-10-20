package com.dlm.bdp.bam_basemanagement.service;

import java.util.List;

import com.dlm.bdp.bam_basemanagement.vo.NodeExtends;
import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.Node;
import com.dlm.bdp.pojo.NodeContent;
import com.dlm.bdp.pojo.TeletextType;

public interface NodeService {
	List<Node> list();
	void add(Node record);
	void update(Node record);
	void delete(int id);
	Node get(int id);
	
	List<Node> findListByCondition(Node condition);
	List<NodeExtends> packExtendsListBy(List<Node> list);
	NodeExtends packExtendsBy(Node record);
}
