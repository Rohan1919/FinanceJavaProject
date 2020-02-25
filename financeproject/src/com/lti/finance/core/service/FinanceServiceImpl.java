package com.lti.finance.core.service;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.core.daos.EmiScheduleDao;
import com.lti.finance.core.daos.ProductDao;
import com.lti.finance.core.daos.PurchaseProductDao;
//import com.lti.finance.core.daos.PurchaseCardDao;
import com.lti.finance.core.daos.RegistrationDao;
import com.lti.finance.core.entities.EmiSchedule;
import com.lti.finance.core.entities.GovApi;
import com.lti.finance.core.entities.Product;
import com.lti.finance.core.entities.Purchase;
//import com.lti.finance.core.entities.PurchaseCard;
import com.lti.finance.core.entities.User;
import com.lti.finance.core.exception.FinanceException;

@Service
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	private RegistrationDao rdao;
	@Autowired
	private ProductDao pdao;
	
	@Autowired
	private PurchaseProductDao ppdao;
	
	@Autowired 
	private EmiScheduleDao edao;
	
	
	//@Autowired
	//private PurchaseCardDao cdao;
	//Registration user details
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public boolean setUserDetails(User user) throws FinanceException {
		
		if(rdao.isUniqueUser(user.getAadharCardNumber())) {
			GovApi gapi=rdao.isValid(user.getAadharCardNumber());
			if(gapi.getName().equalsIgnoreCase(user.getName()) && (gapi.getAadharCardNo().equalsIgnoreCase(user.getAadharCardNumber()))&& (gapi.getPanCardNo().equalsIgnoreCase(user.getPanCardNumber()))){
				
				return rdao.setUserDetails(user);
		
			}else {
				return false;
			}
		}
		else {
			return false;
		}
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
//	@Transactional(propagation =Propagation.REQUIRES_NEW)
//	@Override
//	public PurchaseCard getPurchaseCardDetails(int pcardNo)throws FinanceException {
//		
//		return cdao.getPurchaseCardDetails(pcardNo);
//	}
//
//	@Override
//	@Transactional(propagation =Propagation.REQUIRES_NEW)
//	public boolean setPurchaseCardDetails(PurchaseCard pcard) throws FinanceException{
//		
//		return cdao.setPurchaseCardDetails(pcard);
//	}
//
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public List<Product> getProductDetailsByType(String productType) throws FinanceException {
		
		return pdao.getProductDetailsByType(productType);
	}

	
	//PurchaseProduct Management and EmiSchedule Management  Methods
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public boolean setPurchaseProductDetails(Purchase purchase) throws FinanceException {
		purchase.setMonthlyEmi((purchase.getTotalAmount()/purchase.getTenturePeriod()));
		boolean b=setEmiSchedule(purchase);//method 
		return ppdao.setPurchaseProductDetails(purchase);
	}
	
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	public boolean setEmiSchedule(Purchase purchase) throws FinanceException  {
		
		EmiSchedule emiSch=null;
		List <EmiSchedule> emiSchedule=new ArrayList<>();
		
		for(int i=1;i<=purchase.getTenturePeriod();i++) {
			emiSch=new EmiSchedule();
		     emiSch.setInstallmentNo(i);
		     emiSch.setPurchaseId(purchase.getPurchaseId());
		     emiSch.setDueDate(Date.valueOf((LocalDate.now().plusDays(30*i))));
		     emiSch.setAmountReceived(purchase.getMonthlyEmi());
		     emiSch.setAmountReceivable(purchase.getTotalAmount());
		     emiSch.setStatus("NO"); 
		     emiSchedule.add(emiSch);
		}
		
		return edao.setEmiSchedule(emiSchedule);
	
	}
	//Login
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public User getUser(User user) throws FinanceException {
		
		return rdao.getUser(user);
	}
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public List<Product> getUserProducts(int userId) throws FinanceException {
		return pdao.getUserProducts(userId); 
	}
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public List<EmiSchedule> getSchedules(int userId) throws FinanceException {
		// TODO Auto-generated method stub
		return ppdao.getSchedules(userId);
	}
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public boolean changeTransactionStatus(EmiSchedule eSch) throws FinanceException {
		return ppdao.changeTransactionStatus(eSch);
	}
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public ArrayList<Product> getProductList() throws FinanceException {
		
		return pdao.getProductList();
	}


}
