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

	@GetMapping(value = "/main")
	public String main(Model model, @RequestParam(defaultValue = "0") int rCode,
			@RequestParam(defaultValue = "1") int lId, @RequestParam(defaultValue = "H") String flag) throws Exception {

		// 리스트
		List<ListModel> list = listService.selectList(rCode);
		model.addAttribute("list", list);

		// 한 건
		int firstlId = 1;

		if (flag.equals("H")) {
			if (rCode != 0) {
				firstlId = listService.firstLid(rCode);
			} else {
				firstlId = 1;
			}
			ListModel detail = listService.selectDetail(firstlId);
			model.addAttribute("detail", detail);
		}
		
		else {
			ListModel detail = listService.selectDetail(lId);
			model.addAttribute("detail", detail);
		}

		model.addAttribute("rCode", rCode);
		model.addAttribute("lId", lId);
		model.addAttribute("firstlId", firstlId);

		return "index";
	}

}
