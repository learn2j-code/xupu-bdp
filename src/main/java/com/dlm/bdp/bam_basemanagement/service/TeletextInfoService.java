package com.dlm.bdp.bam_basemanagement.service;

import java.util.List;

import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.TeletextInfo;
import com.dlm.bdp.pojo.TeletextType;

public interface TeletextInfoService {
	List<TeletextInfo> list();
	void add(TeletextInfo record);
	void update(TeletextInfo record);
	void delete(int id);
	TeletextInfo get(int id);
	List<TeletextInfo> findTeletextInfoListByCenterId(Integer centerId);
	
	void deleteTeletextInfoByCenterId(Integer centerId);
//	String getKeywordsValueByKeywordsCode(String keywordsCode,Integer bookId);
//	
//	List<KeywordsConfig> findKeywordsConfigListByBookId(Integer bookId);
}
