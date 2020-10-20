package com.dlm.bdp.bam_basemanagement.vo;


import com.dlm.bdp.pojo.AreaInfo;
import com.dlm.bdp.pojo.Dictionary;
import com.dlm.bdp.pojo.NodeContent;
import com.dlm.bdp.pojo.NodeContentWithBLOBs;
import com.dlm.bdp.pojo.RelationshipCall;
import com.dlm.bdp.pojo.ServiceCenter;
import com.dlm.bdp.pojo.TeletextCenter;
import com.dlm.bdp.util.Page;


public class RequestEntity {
	private Integer id;
	private Page page;
	private ServiceCenter serviceCenter;
	private AreaInfo areaInfo;
	private TeletextCenter teletextCenter;
	private RelationshipCall relationshipCall;
	
	private NodeContentWithBLOBs nodeContent;
	private NodeExtends node;
	
	private Dictionary dictionary;
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public ServiceCenter getServiceCenter() {
		return serviceCenter;
	}

	public void setServiceCenter(ServiceCenter serviceCenter) {
		this.serviceCenter = serviceCenter;
	}

	public AreaInfo getAreaInfo() {
		return areaInfo;
	}

	public void setAreaInfo(AreaInfo areaInfo) {
		this.areaInfo = areaInfo;
	}

	public TeletextCenter getTeletextCenter() {
		return teletextCenter;
	}

	public void setTeletextCenter(TeletextCenter teletextCenter) {
		this.teletextCenter = teletextCenter;
	}

	public RelationshipCall getRelationshipCall() {
		return relationshipCall;
	}

	public void setRelationshipCall(RelationshipCall relationshipCall) {
		this.relationshipCall = relationshipCall;
	}

	public NodeContentWithBLOBs getNodeContent() {
		return nodeContent;
	}

	public void setNodeContent(NodeContentWithBLOBs nodeContent) {
		this.nodeContent = nodeContent;
	}

	public NodeExtends getNode() {
		return node;
	}

	public void setNode(NodeExtends node) {
		this.node = node;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Dictionary getDictionary() {
		return dictionary;
	}

	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
}
