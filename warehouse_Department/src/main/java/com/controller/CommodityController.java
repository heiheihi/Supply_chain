package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fhhService.CommodityService;
import com.pojo.Commodity;

@RestController
public class CommodityController {

	@Autowired
	CommodityService commodityService;
	
	@RequestMapping(value="/list")
	public List<Commodity> listCommodity(){
		return commodityService.listCommodity();
	}
}
