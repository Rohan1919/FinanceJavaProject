package com.lti.finance.core.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.core.entities.GovApi;
import com.lti.finance.core.entities.Product;
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;

public interface RegistrationDao {
	
	
	public User setUserDetails(User user) throws FinanceException;
	
	public ArrayList<User> getUserList() throws FinanceException;

	public GovApi isValid(String name);

	public boolean isUniqueUser(String aadharCardNumber);

	public User getUser(User user) throws FinanceException;
	

}
