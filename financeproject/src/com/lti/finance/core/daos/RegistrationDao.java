package com.lti.finance.core.daos;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.core.entities.Product;
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;

public interface RegistrationDao {
	
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean setUserDetails(User user) throws FinanceException;
	
	public ArrayList<User> getUserList() throws FinanceException;
	

}
