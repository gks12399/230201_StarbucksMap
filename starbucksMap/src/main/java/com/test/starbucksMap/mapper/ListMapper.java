package com.test.starbucksMap.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.starbucksMap.model.ListModel;

@Mapper
public interface ListMapper {
	
	public List<ListModel> selectList(int rCode) throws Exception;
	
}
