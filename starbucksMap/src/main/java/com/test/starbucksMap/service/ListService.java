package com.test.starbucksMap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.starbucksMap.model.ListModel;

@Service
public interface ListService {

	public List<ListModel> selectList(int rCode) throws Exception;
	
	public ListModel selectDetail(int lId) throws Exception;
	
	public int firstLid(int rCode) throws Exception;

}
