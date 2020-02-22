package com.lti.finance.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.core.entities.Product;
import com.lti.finance.core.entities.PurchaseCard;
import com.lti.finance.core.exception.FinanceException;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@PersistenceContext
	private EntityManager manager;
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public Product getProductDetails(int productId)throws FinanceException {
		
		Product product=manager.find(Product.class,productId);
		return product;
	}
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean setProductDetails(Product product) throws FinanceException{
		manager.merge(product);
		return true;
	}
}
