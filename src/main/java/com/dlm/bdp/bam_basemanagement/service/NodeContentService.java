package com.dlm.bdp.bam_basemanagement.service;

import java.util.List;

import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.Node;
import com.dlm.bdp.pojo.NodeContent;
import com.dlm.bdp.pojo.NodeContentWithBLOBs;
import com.dlm.bdp.pojo.TeletextType;

public interface NodeContentService {
	List<NodeContentWithBLOBs> list();
	void add(NodeContentWithBLOBs record);
	void update(NodeContentWithBLOBs record);
	void delete(int id);
	NodeContentWithBLOBs get(int id);
	
	List<NodeContentWithBLOBs> findListByCondition(NodeContentWithBLOBs condition);
}
