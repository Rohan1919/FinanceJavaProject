//package com.lti.finance.web.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lti.finance.core.entities.Product;
//import com.lti.finance.core.entities.PurchaseCard;
//import com.lti.finance.core.exception.FinanceException;
//import com.lti.finance.core.service.FinanceService;
//
//@RestController
//public class PurchaseCardController {
//	
//	@Autowired
//	private FinanceService service;
//	
//	@PutMapping(value="/getCardDetails",consumes="application/json",produces="application/json")
//	public @ResponseBody PurchaseCard getCardDetails(@RequestBody int cardNo) {
//		PurchaseCard pCard=null; 
//		try {
//			pCard= service.getPurchaseCardDetails(cardNo);
//		} catch (FinanceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return pCard;
//
//	}
//
//
//	@PostMapping(value="/setCardDetails",consumes="application/json")
//	public boolean setCardDetails(@RequestBody PurchaseCard pcard){
//		 try {
//			return service.setPurchaseCardDetails(pcard);
//		} catch (FinanceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 return false;
//	}
//}