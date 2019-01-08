package com.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fhhService.Commodity_detailsService;
import com.fhhpojo.Commodity_details;
import com.mapper.Commodity_detailsMapper;

@Service
public class Commodity_detailsServiceImpl implements Commodity_detailsService{

	@Autowired
	private Commodity_detailsMapper details;
	

	@Override
	public int findtotal() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public List<Commodity_details> listCommodity(String date_of_production, String commodity_name) {
		// TODO Auto-generated method stub
		return details.listDetails(date_of_production, commodity_name);
	}


	

}
