package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fhhService.CommodityService;
import com.fhhpojo.Commodity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class CommodityController {

	@Autowired
	CommodityService commodityService;

	@RequestMapping(value = "/list")
	public String listCommodity(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, Model model) {
		int pageSize = 2;
		PageHelper.startPage(pageNum, pageSize);
		List<Commodity> listCommodity = commodityService.listCommodity();
		PageInfo<Commodity> page = new PageInfo<Commodity>(listCommodity);
		/*List<Commodity> listCommodity = commodityService.listCommodity(pageNum,pageSize);
		int findtotal = commodityService.findtotal();
		int count = findtotal%pageSize==0?findtotal/pageSize:(findtotal/pageSize)+1;*/
		/*model.addAttribute("listCommodity", listCommodity);
		model.addAttribute("count", count);
		model.addAttribute("pageNum", pageNum);*/
		model.addAttribute("page", page);
		return "find-form";
	}
}
