package com.lti.finance.core.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.core.entities.EmiSchedule;
import com.lti.finance.core.exception.FinanceException;

@Repository
public class EmiScheduleDaoImpl implements EmiScheduleDao {
	@PersistenceContext
	private EntityManager manager;
	
	//@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean setEmiSchedule(List<EmiSchedule> emiSchedule)throws FinanceException {
       for(EmiSchedule l:emiSchedule) {
		manager.merge(l);
		
       }
       return true;
	}
}
