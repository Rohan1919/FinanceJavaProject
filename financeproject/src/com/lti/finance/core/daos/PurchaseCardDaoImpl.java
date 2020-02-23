//package com.lti.finance.core.daos;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.lti.finance.core.entities.PurchaseCard;
//import com.lti.finance.core.exception.FinanceException;
//
//@Repository
//public class PurchaseCardDaoImpl implements PurchaseCardDao{
//	
//	@PersistenceContext
//	private EntityManager manager;
//	
//	@Transactional(propagation = Propagation.REQUIRED)
//	public boolean setPurchaseCardDetails(PurchaseCard pcard) throws FinanceException {
//		manager.persist(pcard);
//		return true;
//	}
//	@Transactional(propagation = Propagation.REQUIRED)
//	@Override
//	public PurchaseCard getPurchaseCardDetails(int pcardNo)throws FinanceException  {
//		PurchaseCard purchaseCard = manager.find(PurchaseCard.class,pcardNo); 
//		return purchaseCard;
//	}
//
//}
