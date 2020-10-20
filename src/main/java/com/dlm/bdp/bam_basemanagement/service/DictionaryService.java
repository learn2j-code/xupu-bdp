package com.dlm.bdp.bam_basemanagement.service;

import java.util.List;

import com.dlm.bdp.pojo.Dictionary;

public interface DictionaryService {
	List<Dictionary> list();
	void add(Dictionary record);
	void update(Dictionary record);
	void delete(int id);
	Dictionary get(int id);
	
	List<Dictionary> findListByCondition(Dictionary condition);
}
