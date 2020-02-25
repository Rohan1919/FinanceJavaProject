package com.lti.finance.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<EmiSchedule> getSchedules(int userId) throws FinanceException {
	    Query qry=manager.createQuery("select e.transactionId,e.installmentNo,e.dueDate,e.amountReceived,e.status,d.productName  from EmiSchedule e join e.purchase p join p.product d where userId=:userid)");
	    qry.setParameter("userid",userId);
	    List<EmiSchedule> emiS=qry.getResultList();
		
		return (ArrayList<EmiSchedule>)emiS;
	}
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean changeTransactionStatus(EmiSchedule eSch) throws FinanceException {
		Query qry=manager.createQuery("update status set status ='Yes' where transactionId=:tranid AND amountReceived=:amtr");
		qry.setParameter("amtr",eSch.getAmountReceived());
		qry.setParameter("tranid", eSch.getTransactionId());
		int q=qry.executeUpdate();
		if(q==0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	

}
