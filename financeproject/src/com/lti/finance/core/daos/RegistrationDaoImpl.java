package com.lti.finance.core.daos;

import java.util.ArrayList;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.core.entities.Product;
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean setUserDetails(User user) throws FinanceException {
		manager.persist(user);
		return true;
	}

	@Override
	public ArrayList<User> getUserList() throws FinanceException {
		Query qry=manager.createQuery("from User");
		ArrayList <User> userList=(ArrayList<User>) qry.getResultList();
		
		return userList;
	}

	
	
	

}
