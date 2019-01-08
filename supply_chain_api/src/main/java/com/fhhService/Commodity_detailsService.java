package com.fhhService;

import java.util.List;

import com.fhhpojo.Commodity_details;

public interface Commodity_detailsService {
	
	/*int pageNum,int pageSize*/

	 List<Commodity_details> listCommodity(String date_of_production,String commodity_name);
	 
	 int findtotal();
}
