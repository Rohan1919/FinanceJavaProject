package com.lti.finance.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.finance.core.entities.Product;
import com.lti.finance.core.entities.PurchaseCard;
import com.lti.finance.core.service.FinanceService;

//@CrossOrigin
@RestController
public class ProductController {
	@Autowired
	private FinanceService service;
	
	@GetMapping(value="/getProductDetails",consumes="application/json",produces="application/json")
	public @ResponseBody Product getProductDetails(@RequestBody int proId) {
		 return service.getProductDetails(proId);
	}
	@PostMapping(value="/setProductDetails",consumes="application/json")
	public boolean setProductDetails(@RequestBody Product product){
		 return service.setProductDetails(product);

	}

}
