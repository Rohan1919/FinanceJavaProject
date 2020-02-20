package com.lti.finance.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.finance.core.entities.PurchaseCard;

@Repository
public class PurcahseCardDaoImpl implements PurchaseCardDao{
	
	@PersistenceContext
	private EntityManager manager;

	public boolean setPurchaseCardDetails(PurchaseCard pcard) {
		manager.persist(pcard);
		return true;
	}

	@Override
	public PurchaseCard getPurchaseCardDetails(int pcardNo) {
		PurchaseCard purchaseCard = manager.find(PurchaseCard.class,pcardNo); 
		return purchaseCard;
	}

}
