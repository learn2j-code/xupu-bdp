package com.dlm.bdp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.bdp.bam_basemanagement.service.AreaInfoService;
import com.dlm.bdp.bam_basemanagement.vo.AreaInfoExtends;
import com.dlm.bdp.bam_basemanagement.vo.RequestEntity;
import com.dlm.bdp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.bdp.constant.CommonConstant;
import com.dlm.bdp.pojo.AreaInfo;
import com.dlm.bdp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("areamanage")
public class AreaManageController {
	@Autowired
	AreaInfoService areaInfoService;	
	
	/**
	 * 	根据区域名称模糊查询区域信息列表
	 * @return
	 */
	@RequestMapping("findAreaInfoListByAreaName")
	public @ResponseBody ResponseEntity findAreaInfoListByAreaName(@RequestBody AreaInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<AreaInfo> areaList = areaInfoService.findAreaInfoListByAreaName(record.getAreaName());
		data.put("areaList", areaList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询所有区域
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<AreaInfo> areaList = areaInfoService.list();
		data.put("areaList", areaList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 	查询分页查询区域
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
		
		List<AreaInfo> areaList = areaInfoService.findAreaInfoListByAreaName(requestEntity.getAreaInfo().getAreaName());
		
		int total = (int)new PageInfo<>(areaList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("areaList", areaList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个区域信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody AreaInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		AreaInfo areaInfoTemp = areaInfoService.get(record.getAreaId());
		AreaInfo parentAreaInfo = areaInfoService.findAreaInfoByCodeId(areaInfoTemp.getParentId());
		AreaInfoExtends areaInfo = new AreaInfoExtends();
		areaInfo.setAreaId(areaInfoTemp.getAreaId());
		areaInfo.setAreaName(areaInfoTemp.getAreaName());
		areaInfo.setCodeId(areaInfoTemp.getCodeId());
		areaInfo.setParentId(areaInfoTemp.getParentId());
		if(parentAreaInfo!=null) {
			areaInfo.setParentAreaName(parentAreaInfo.getAreaName());
		}
		data.put("areaInfo", areaInfo);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody AreaInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			areaInfoService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody AreaInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			areaInfoService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody AreaInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			areaInfoService.delete(record.getAreaId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 根据上级id查区域信息
	 * @param record
	 * @return
	 */
	@RequestMapping("findAreaInfoListByParentId")
	public @ResponseBody ResponseEntity findAreaInfoListByParentId(@RequestBody AreaInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<AreaInfo> areaList = areaInfoService.findAreaInfoListByParentId(record.getParentId());
		data.put("areaList", areaList);
		responseEntity.setData(data);
		return responseEntity;
	}	
}
