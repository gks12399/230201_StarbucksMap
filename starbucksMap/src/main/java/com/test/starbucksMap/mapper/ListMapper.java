package com.test.starbucksMap.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.starbucksMap.model.ListModel;

@Mapper
public interface ListMapper {
	
	// 리스트
	public List<ListModel> selectList(int rCode) throws Exception;

	// 한 건
	public ListModel selectDetail(int lId) throws Exception;
	
	// 상단 lId
	public int firstLid(int rCode) throws Exception;
	
}
