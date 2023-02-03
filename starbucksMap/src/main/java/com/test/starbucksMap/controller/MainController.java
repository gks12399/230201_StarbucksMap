package com.test.starbucksMap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.starbucksMap.model.ListModel;
import com.test.starbucksMap.service.ListService;

@Controller
public class MainController {

	@Autowired
	ListService listService;

	@GetMapping(value = "/test")
	public String testView(Model model) throws Exception {

		model.addAttribute("test", "타임리프테스트");
		return "test";
	}

	@GetMapping(value = "/main")
	public String mainView(Model model, @RequestParam(defaultValue = "0") int rCode,
			@RequestParam(defaultValue = "1") int lId) throws Exception {
		
		// 리스트
		List<ListModel> list = listService.selectList(rCode);
		model.addAttribute("list", list);
		
		// 한 건
		
		int firstlId = 1;
		
		if (rCode != 0) {
			firstlId = listService.firstLid(rCode);
		}
		else {
			firstlId = 1;
		}

		ListModel detail = listService.selectDetail(lId);
		model.addAttribute("detail", detail);
		
		model.addAttribute("rCode", rCode);
		model.addAttribute("firstlId", firstlId);
		
		System.out.println("rCode : " + rCode);
		System.out.println("lId : " + lId);
		System.out.println("firstlId : " + firstlId);
		System.out.println("-----------------------");
		
		return "index";
	}

	@GetMapping(value = "/map")
	public String View() throws Exception {
		return "map";
	}

}
