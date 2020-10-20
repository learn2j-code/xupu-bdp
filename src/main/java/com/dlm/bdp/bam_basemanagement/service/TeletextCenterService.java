package com.dlm.bdp.bam_basemanagement.service;

import java.util.List;

import com.dlm.bdp.bam_basemanagement.vo.TeletextCenterExtends;
import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.TeletextCenter;
import com.dlm.bdp.pojo.TeletextType;

public interface TeletextCenterService {
	List<TeletextCenter> list();
	void add(TeletextCenter record);
	void update(TeletextCenter record);
	void delete(int id);
	TeletextCenter get(int id);
	
	void addTeletextCenterExtends(TeletextCenterExtends record);
	void updateTeletextCenterExtends(TeletextCenterExtends record);
	List<TeletextCenter> findListByCondition(TeletextCenter condition);
	List<TeletextCenterExtends> packTeletextCenterExtendsList(List<TeletextCenter> list);
//	String getKeywordsValueByKeywordsCode(String keywordsCode,Integer bookId);
//	
//	List<KeywordsConfig> findKeywordsConfigListByBookId(Integer bookId);
}
