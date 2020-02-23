package com.lti.finance.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.core.entities.Purchase;
import com.lti.finance.core.exception.FinanceException;

@Repository
public class PurchaseProductDaoImpl implements PurchaseProductDao {

	@PersistenceContext
	private EntityManager manager;
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean setPurchaseProductDetails(Purchase purchase) throws FinanceException {
		
		manager.merge(purchase);
		return true;
	}
	
	

}
