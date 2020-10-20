package com.dlm.bdp.bam_basemanagement.service;

import java.util.List;

import com.dlm.bdp.pojo.RelationshipCall;

public interface RelationshipCallService {
	List<RelationshipCall> list();
	void add(RelationshipCall record);
	void update(RelationshipCall record);
	void delete(int id);
	RelationshipCall get(int id);
	
	List<RelationshipCall> findListByCondition(RelationshipCall condition);
}
