package com.lti.finance.core.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.lti.finance.core.daos.ProductDao;
import com.lti.finance.core.daos.PurchaseCardDao;
import com.lti.finance.core.daos.RegistrationDao;
import com.lti.finance.core.entities.Product;
import com.lti.finance.core.entities.PurchaseCard;
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;

@Service
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	private RegistrationDao rdao;
	@Autowired
	private ProductDao pdao;
	
	@Autowired
	private PurchaseCardDao cdao;
	//Registration user details
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public boolean setUserDetails(User user) throws FinanceException {
		
		return rdao.setUserDetails(user);
	}
	
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public ArrayList<User> getUserList() throws FinanceException {
		return rdao.getUserList();
	}
	
	//Product Related Methods
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public Product getProductDetails(int productId) throws FinanceException{
		
		return pdao.getProductDetails(productId);
	}

	@Override
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	public boolean setProductDetails(Product product)throws FinanceException {
		
		return pdao.setProductDetails(product);
	}
	
	//Card Related Methods
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public PurchaseCard getPurchaseCardDetails(int pcardNo)throws FinanceException {
		
		return cdao.getPurchaseCardDetails(pcardNo);
	}

	@Override
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	public boolean setPurchaseCardDetails(PurchaseCard pcard) throws FinanceException{
		
		return cdao.setPurchaseCardDetails(pcard);
	}

	
	//
	

}
