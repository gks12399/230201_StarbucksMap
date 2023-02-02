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
	
	@Override
	public List<ListModel> selectList(int rCode) throws Exception {
		// TODO Auto-generated method stub
		return listMapper.selectList(rCode);
	}

}
