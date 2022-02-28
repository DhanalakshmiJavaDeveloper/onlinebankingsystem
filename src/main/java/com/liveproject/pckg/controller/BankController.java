package com.liveproject.pckg.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liveproject.pckg.dao.BankRepo;
import com.liveproject.pckg.entity.Bank;

@Controller
public class BankController {
		
		@Autowired
		BankRepo br;
		
		@RequestMapping("/")
		public String show()
		{
			return "index.jsp"; 
		}
		
		@RequestMapping("/addcustomer")
		@ResponseBody
		public String addcustomer(Bank b)
		{
			br.save(b);
			return "customer added...";
		}
		
		@RequestMapping("/viewcustomer")
		@ResponseBody
		public String viewcustomer(int cusid)
		{
			Bank b = ((Object) br.findById(cusid)).orElse(new Bank());
			return b.toString();
		}
		
		@RequestMapping("/viewallcustomers")
		@ResponseBody
		public String viewallcustomers()
		{
			List<Bank> bl =(List<Bank>) br.findAll();
			return bl.toString();
		}
		
		@RequestMapping("/updatecustomer")
		@ResponseBody
		public String updatevideo(Bank b)
		{
			br.save(b);
			return "video updated...";
		}
		
		@RequestMapping("/deletecustomer")
		@ResponseBody
		public String deletecustomer(int cusid)
		{
			br.deleteById(cusid);
			return "customer deleted...";
		}


}