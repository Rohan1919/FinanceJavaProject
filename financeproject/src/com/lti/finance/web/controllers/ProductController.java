package com.lti.finance.web.controllers;



import java.util.ArrayList;
import java.util.List;

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
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;
import com.lti.finance.core.service.FinanceService;

@CrossOrigin
@RestController
public class ProductController {
	@Autowired
	private FinanceService service;
	//getting product data from id
//	@GetMapping(value="/getProductDetails/{productId}",produces="application/json")
//	public @ResponseBody Product getProductDetails(@PathVariable("productId") int productId) {
//		System.out.println(productId);
//		Product prod=null;
//		 try {
//			prod=service.getProductDetails(productId);
//		} catch (FinanceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 return prod;
//	}
	
	@PutMapping(value="/getProductDetails",produces="application/json",consumes="application/json")
	public @ResponseBody Product getProductDetails(@RequestBody Product product) {
		System.out.println(product.getProductId());
		Product prod=null;
		 try {
			prod=service.getProductDetails(product.getProductId());
		} catch (FinanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return prod;
	}
	
	
	//entering product data into database
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
	
//	//fetching product by type
//	@GetMapping(value="/getProductDetails/{productType}",produces="application/json")
//	public @ResponseBody List<Product> getProductDetailsByType(@PathVariable("productType") String productType) {
//		System.out.println(productType);
//		List<Product> prod=new ArrayList<>();
//		 try {
//			prod=service.getProductDetailsByType(productType);
//		} catch (FinanceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 return prod;
//	}
	
	//fetching product by type
		@PutMapping(value="/getProductDetailsByType",produces="application/json",consumes="application/json")
		public @ResponseBody List<Product> getProductDetailsByType(@RequestBody Product product) {
			System.out.println(product.getProductType());
			List<Product> prod=new ArrayList<>();
			 try {
				prod=service.getProductDetailsByType(product.getProductType());
			} catch (FinanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return prod;
		}
		
		@PostMapping(value="/buyProducts",produces="application/json",consumes="application/json")
		public @ResponseBody List<Product> getUserProducts(@RequestBody User user) {
			System.out.println(user.getUserId());
			List<Product> prod=new ArrayList<>();
			 try {
				prod=service.getUserProducts(user.getUserId());
			} catch (FinanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return prod;
		}

}
