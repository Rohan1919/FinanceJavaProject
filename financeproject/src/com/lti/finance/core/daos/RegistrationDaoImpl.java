package com.lti.finance.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.core.entities.GovApi;
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean setUserDetails(User user) throws FinanceException {
		manager.merge(user);
		return true;
	}
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public ArrayList<User> getUserList() throws FinanceException {
		Query qry=manager.createQuery("from User");
		List <User> userList=qry.getResultList();
		
		return (ArrayList<User>)userList;
	}
	@Override
	public GovApi isValid(String aadharCardNo) {
		GovApi gapi=manager.find(GovApi.class,aadharCardNo);
	    return gapi;
	}
	@Override
	public boolean isUniqueUser(String aadharCardNo) {
		Query qry=manager.createQuery("select u from User u where u.aadharCardNumber=:aadharCardNo");
		qry.setParameter("aadharCardNo", aadharCardNo);
		List<User> user=(ArrayList<User>)qry.getResultList();
		System.out.println(user);
		if(user.isEmpty()) {
			return true;
		}
		else
			return false;
		
	}
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public User getUser(User user) throws FinanceException {
		Query qry=manager.createQuery("select u from User u where u.userName=:username AND u.password=:pass");
		qry.setParameter("username", user.getUserName());
		qry.setParameter("pass", user.getPassword());
		User userLocal= (User) qry.getSingleResult();
		if(userLocal.equals(null)) {
		    userLocal.setUserId(-1);
		}
		
		return userLocal;
	}
	
	
}
