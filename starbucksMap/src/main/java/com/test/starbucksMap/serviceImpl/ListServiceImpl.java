package com.test.starbucksMap.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.starbucksMap.mapper.ListMapper;
import com.test.starbucksMap.model.ListModel;
import com.test.starbucksMap.service.ListService;

@Service
public class ListServiceImpl implements ListService{
	
	@Autowired
	ListMapper listMapper;
	
	// 전체 리스트
	@Override
	public List<ListModel> selectList(int rCode) throws Exception {
		return listMapper.selectList(rCode);
	}
	
	// 한 건
	@Override
	public ListModel selectDetail(int lId) throws Exception {
		return listMapper.selectDetail(lId);
	}

	// 상단 lId
	@Override
	public int firstLid(int rCode) throws Exception {
		return listMapper.firstLid(rCode);
	}
	
}
