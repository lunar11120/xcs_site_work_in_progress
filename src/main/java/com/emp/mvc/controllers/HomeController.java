package com.emp.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emp.mvc.model.Opsnotice;
import com.emp.mvc.services.Ops_noticeDAO;

@Controller
public class HomeController {
	
	@Autowired
	private Ops_noticeDAO noticeList;
	
	@RequestMapping(value="/")
	public String goHome(Model model) {
		
		//Send this message to indexpage.
		String welcomemeg = "Hi How are you.";
		model.addAttribute("meg1", welcomemeg);
		
		return "index";
	}
	
	
	@RequestMapping(value="/detail")
	public String goNoticeList(Model model) {
		
	    List<Opsnotice> noticeList = new ArrayList<Opsnotice>();
	    model.addAttribute("noticelist_model", this.noticeList.List_of_OpsNotice());
		
		return "notice_list";
	}
	
	
	@RequestMapping(value="/add_data")
	public String goAddData() {
		
		
		return "add_data";
	}
	
	
	@RequestMapping(value="/edit_page")
	public String goEdit() {
		
		
		return "edit_page";
	}

}
