package com.emp.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emp.mvc.services.Ops_noticeDAO;

@Controller
@RequestMapping(value="/noticelist")
public class NoticeController {
	
	@Autowired
	private Ops_noticeDAO noticeList;
	
	@RequestMapping(value="/{noticeId}" )
	public String findProject_byId(Model model ,@PathVariable("noticeId") int nid) {
		model.addAttribute("noticeId" ,this.noticeList.findByPrimarykey(nid));
		return "notice_detail";
	}

}
