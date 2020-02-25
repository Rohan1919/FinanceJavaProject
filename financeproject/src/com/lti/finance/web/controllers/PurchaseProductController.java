package com.lti.finance.web.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.finance.core.entities.EmiSchedule;
import com.lti.finance.core.entities.Purchase;
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;
import com.lti.finance.core.service.FinanceService;



@CrossOrigin
@RestController
public class PurchaseProductController {
	
	@Autowired
	private FinanceService service;
	//for buying products entering records into purchase and schedule tables according to emi scheme
	@PostMapping(value="/purchaseProduct",consumes="application/json")
	public boolean setPurchaseProductDetails(@RequestBody Purchase purchase) {
	try {
		return service.setPurchaseProductDetails(purchase);
	} catch (FinanceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	}
	//Displaying Schedules on dashboard
	@PostMapping(value="/schedules",consumes="application/json")
	public @ResponseBody List<EmiSchedule> getSchedules(@RequestBody User user) {
		EmiSchedule emiS=new EmiSchedule();
		List<EmiSchedule> emiSchedule=new ArrayList<>();
		try {
			emiSchedule=service.getSchedules(user.getUserId());
		} catch (FinanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emiSchedule;
	}
	
	//changing status of TransactionSchedule
	
	@PostMapping(value="/transactionStatus",consumes="application/json")
	public boolean changeTransactionSchedule(@RequestBody EmiSchedule eSch) {
	try {
		return service.changeTransactionStatus(eSch);
	} catch (FinanceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	}
}



