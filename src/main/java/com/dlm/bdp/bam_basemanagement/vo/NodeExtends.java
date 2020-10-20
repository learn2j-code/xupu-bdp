package com.dlm.bdp.bam_basemanagement.vo;

import java.util.List;

import com.dlm.bdp.pojo.Node;
import com.dlm.bdp.pojo.NodeContent;
import com.dlm.bdp.pojo.NodeContentWithBLOBs;

public class NodeExtends extends Node {
	private List<NodeContentWithBLOBs> nodeContentList;

	public List<NodeContentWithBLOBs> getNodeContentList() {
		return nodeContentList;
	}

	public void setNodeContentList(List<NodeContentWithBLOBs> nodeContentList) {
		this.nodeContentList = nodeContentList;
	}

}
