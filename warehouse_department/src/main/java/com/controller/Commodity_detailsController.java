package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fhhService.Commodity_detailsService;
import com.fhhpojo.Commodity_details;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class Commodity_detailsController {

	@Autowired
	private Commodity_detailsService detailsService;
	
	@RequestMapping(value="/listDetails")
	private String listDetails(@RequestParam(value="date_of_production",required=false)String date_of_production,
			@RequestParam(value="commodity_name",required=false)String commodity_name,
			@RequestParam(value="pageNum",defaultValue="0",required=false)int pageNum,Model model) {
		int pageSize = 2;
		PageHelper.startPage(pageNum, pageSize);
		List<Commodity_details> listCommodity = detailsService.listCommodity(date_of_production, commodity_name);
		PageInfo<Commodity_details> page = new PageInfo<>(listCommodity);
		if(page!=null) {
			model.addAttribute("page", page);
			model.addAttribute("date_of_production", date_of_production);
			model.addAttribute("commodity_name", commodity_name);
			return "find-form";
		}
		return "";
	}
	
}
