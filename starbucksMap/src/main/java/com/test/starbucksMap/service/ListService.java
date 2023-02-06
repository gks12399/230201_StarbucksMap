package com.test.starbucksMap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.starbucksMap.model.ListModel;

@Service
public interface ListService {
	
	// 리스트
	public List<ListModel> selectList(int rCode) throws Exception;
	
	// 한 건 
	public ListModel selectDetail(int lId) throws Exception;
	
	// 상단 lId
	public int firstLid(int rCode) throws Exception;

}
