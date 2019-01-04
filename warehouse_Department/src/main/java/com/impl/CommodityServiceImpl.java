package com.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fhhService.CommodityService;
import com.fhhpojo.Commodity;
import com.mapper.CommodityMapper;

@Service
public class CommodityServiceImpl implements CommodityService{

	@Autowired
	private CommodityMapper commodityMapper;
	
	
	@Override
	public int findtotal() {
		// TODO Auto-generated method stub
		return commodityMapper.total();
	}


	@Override
	public List<Commodity> listCommodity() {
		// TODO Auto-generated method stub
		return commodityMapper.list();
	}


	/*@Override
	public List<Commodity> listCommodity(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return commodityMapper.list(pageNum, pageSize);
	}*/

}
