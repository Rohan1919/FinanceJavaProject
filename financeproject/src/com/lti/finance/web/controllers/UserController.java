package com.lti.finance.web.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;
import com.lti.finance.core.service.FinanceService;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	private FinanceService fService;
	
	@PostMapping(value="/registration",consumes="application/json")
	public boolean setUserDetails(@RequestBody User user){
		//String pr = user.getpCard().getCardType();
		try {
			boolean p= fService.setUserDetails(user);
			return p;
		} catch (FinanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	@GetMapping(value="/getUserDetails",produces="application/json")
	public @ResponseBody ArrayList<User> getUserDetails(){
		ArrayList<User> userList=null;
		try {
			userList=fService.getUserList();
		} catch (FinanceException e) {
			
			e.printStackTrace();
		}
		System.out.println(userList);
		return userList;
	}
	
	

}
