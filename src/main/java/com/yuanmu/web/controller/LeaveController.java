package com.yuanmu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuanmu.mapper.LeaveMapper;
import com.yuanmu.model.Leave;

@Controller
@RequestMapping("/leave")
public class LeaveController {
	@Autowired
	private LeaveMapper leaveMapper;
	
	@RequestMapping("/findAll")
	public String findAll(){
		System.out.println("hello");
		List<Leave> findAll = leaveMapper.findAll();
		System.out.println(findAll);
		
		return "hello";
	}
}
