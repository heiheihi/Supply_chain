package com.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.fhhService.CommodityService;
import com.mapper.CommodityMapper;
import com.pojo.Commodity;

@Service
public class CommodityServiceImpl implements CommodityService{

	@Autowired
	private CommodityMapper commodityMapper;
	
	@Override
	public List<Commodity> listCommodity() {
		// TODO Auto-generated method stub
		return commodityMapper.list();
	}

}
