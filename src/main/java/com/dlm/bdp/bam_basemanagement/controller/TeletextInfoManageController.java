package com.dlm.bdp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.bdp.bam_basemanagement.service.FamilyInfoService;
import com.dlm.bdp.bam_basemanagement.service.FamilyServiceService;
import com.dlm.bdp.bam_basemanagement.service.FamilySettingService;
import com.dlm.bdp.bam_basemanagement.service.KeywordsConfigService;
import com.dlm.bdp.bam_basemanagement.service.TeletextInfoService;
import com.dlm.bdp.bam_basemanagement.service.TeletextTypeService;
import com.dlm.bdp.bam_basemanagement.vo.RequestEntity;
import com.dlm.bdp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.bdp.constant.CommonConstant;
import com.dlm.bdp.pojo.FamilyInfo;
import com.dlm.bdp.pojo.FamilyInfoWithBLOBs;
import com.dlm.bdp.pojo.FamilyService;
import com.dlm.bdp.pojo.FamilySetting;
import com.dlm.bdp.pojo.KeywordsConfig;
import com.dlm.bdp.pojo.TeletextInfo;
import com.dlm.bdp.pojo.TeletextType;
import com.dlm.bdp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("teletextinfo")
public class TeletextInfoManageController {
	@Autowired
	TeletextInfoService service;	
	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<TeletextInfo> list = service.list();
		data.put("list", list);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询分页查询
	 * @return
	 */
	@RequestMapping("findByPage")
	public @ResponseBody ResponseEntity findByPage(@RequestBody RequestEntity requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<TeletextInfo> list = service.list();
		
		int total = (int)new PageInfo<>(list).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("list", list);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个家族信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody TeletextInfo parameter){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		TeletextInfo record = service.get(parameter.getId());
		data.put("record", record);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody TeletextInfo parameter){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.add(parameter);
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", parameter);
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑
	 * @param update
	 * @return
	 */
	@RequestMapping("update")
	public @ResponseBody ResponseEntity update(@RequestBody TeletextInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.update(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	删除
	 * @param deleteById
	 * @return
	 */
	@RequestMapping("deleteById")
	public @ResponseBody ResponseEntity deleteById(@RequestBody TeletextInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
