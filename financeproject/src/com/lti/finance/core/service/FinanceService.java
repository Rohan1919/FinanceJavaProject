package com.lti.finance.core.service;

import java.util.ArrayList;

import com.lti.finance.core.entities.Product;
import com.lti.finance.core.entities.PurchaseCard;
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;


public interface FinanceService {
	
	public boolean setUserDetails(User user) throws FinanceException;
	public ArrayList<User> getUserList() throws FinanceException;
	public Product getProductDetails(int productId);
	public boolean setProductDetails(Product product);
	
	public PurchaseCard getPurchaseCardDetails(int cardNo);
    public boolean setPurchaseCardDetails(PurchaseCard pcard);


}
