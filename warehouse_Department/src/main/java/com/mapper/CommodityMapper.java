package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.fhhpojo.Commodity;

@Mapper
public interface CommodityMapper {
   
	/*@Param("pageNum")int pageNum,@Param("pageSize")int pageSize*/
	
	
	List<Commodity> list();
	int total();
}
