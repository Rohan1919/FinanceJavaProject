package com.lti.finance.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.finance.core.entities.Product;
import com.lti.finance.service.FinanceService;

@RestController
public class ProductController {
	@Autowired
	private FinanceService service;
	
	@PostMapping(value="/productDetails",produces="application/json")
	public @ResponseBody Product getProductDetails(@RequestParam int productId) {
		 return service.getProductDetails(productId);
	}

}
