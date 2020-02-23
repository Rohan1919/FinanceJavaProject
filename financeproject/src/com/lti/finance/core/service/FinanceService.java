package com.lti.finance.core.service;

import java.util.ArrayList;
import java.util.List;

import com.lti.finance.core.entities.Product;
import com.lti.finance.core.entities.Purchase;
//import com.lti.finance.core.entities.PurchaseCard;
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;


public interface FinanceService {
	
	
	public boolean setUserDetails(User user) throws FinanceException;
	public ArrayList<User> getUserList() throws FinanceException;
	public Product getProductDetails(int productId)throws FinanceException;
	
	    
	//public PurchaseCard getPurchaseCardDetails(int cardNo)throws FinanceException;
    //public boolean setPurchaseCardDetails(PurchaseCard pcard)throws FinanceException;

	// product Related method	
	public boolean setProductDetails(Product product)throws FinanceException;
	public List<Product> getProductDetailsByType(String productType) throws FinanceException;
	
	//Purchase related methods
	public boolean setPurchaseProductDetails(Purchase purchase) throws FinanceException;
	public boolean setEmiSchedule(Purchase purchase) throws FinanceException;
	

    
    


}
