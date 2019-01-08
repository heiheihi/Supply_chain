package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fhhpojo.Commodity_details;

@Mapper
public interface Commodity_detailsMapper {

	
	 List<Commodity_details> listDetails(@Param("date_of_production")String date_of_production,
			 @Param("commodity_name")String commodity_name);
}
