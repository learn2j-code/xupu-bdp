package com.dlm.bdp.bam_basemanagement.service;

import java.util.List;

import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.TeletextType;

public interface TeletextTypeService {
	List<TeletextType> list();
	void add(TeletextType record);
	void update(TeletextType record);
	void delete(int id);
	TeletextType get(int id);
	
//	String getKeywordsValueByKeywordsCode(String keywordsCode,Integer bookId);
//	
//	List<KeywordsConfig> findKeywordsConfigListByBookId(Integer bookId);
}
