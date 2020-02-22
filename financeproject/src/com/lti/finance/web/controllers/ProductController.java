package com.lti.finance.web.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.finance.core.entities.Product;
import com.lti.finance.core.entities.PurchaseCard;
import com.lti.finance.core.exception.FinanceException;
import com.lti.finance.core.service.FinanceService;

//@CrossOrigin
@RestController
public class ProductController {
	@Autowired
	private FinanceService service;
	
	@PutMapping(value="/getProductDetails",produces="application/json",consumes="application/json")
	public @ResponseBody Product getProductDetails(@RequestBody int proId) {
		System.out.println(proId);
		Product prod=null;
		 try {
			prod=service.getProductDetails(proId);
		} catch (FinanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return prod;
	}
	@PostMapping(value="/setProductDetails",consumes="application/json")
	public boolean setProductDetails(@RequestBody Product product){
		 try {
			return service.setProductDetails(product);
		} catch (FinanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return false;

	}

}
