package com.lti.finance.core.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.core.entities.EmiSchedule;
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
//
//	@Override
//	public List<EmiSchedule> getSchedules(int userId) throws FinanceException {
//	    Query qry=manager.createQuery("select transactionId,)
//		
//		return ;
//	}
//	
//	

}
