package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.pojo.Commodity;

@Mapper
public interface CommodityMapper {

	@Select("select * from commodity")
	List<Commodity> list();
}
