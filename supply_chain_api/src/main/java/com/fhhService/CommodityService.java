package com.fhhService;

import java.util.List;
import com.fhhpojo.Commodity;

public interface CommodityService {
	
	/*int pageNum,int pageSize*/

	 List<Commodity> listCommodity();
	 
	 int findtotal();
}
