package com.lti.finance.core.daos;

import java.util.ArrayList;
import java.util.List;

import com.lti.finance.core.entities.Product;
//import com.lti.finance.core.entities.PurchaseCard;
import com.lti.finance.core.exception.FinanceException;

public interface ProductDao {
	public Product getProductDetails(int productId)throws FinanceException;

	public boolean setProductDetails(Product product)throws FinanceException;

	public List<Product> getProductDetailsByType(String productType) throws FinanceException;

	public List<Product> getUserProducts(int userId) throws FinanceException;

	public ArrayList<Product> getProductList() throws FinanceException;

	
	
}
