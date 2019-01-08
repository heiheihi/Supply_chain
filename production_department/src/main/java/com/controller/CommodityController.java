package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fhhService.Commodity_detailsService;
import com.fhhpojo.Commodity;

@RestController
public class CommodityController {

	@Reference
	Commodity_detailsService commodityService;
	
	
	/*@RequestMapping(value="/list1")*/
	/*public List<Commodity> list(){
		return commodityService.listCommodity();
		
		}*/
	}
