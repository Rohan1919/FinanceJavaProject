package com.lti.finance.web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.finance.core.entities.Purchase;
import com.lti.finance.core.exception.FinanceException;
import com.lti.finance.core.service.FinanceService;



@CrossOrigin
@RestController
public class PurchaseProductController {
	
	@Autowired
	private FinanceService service;
	
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
}



