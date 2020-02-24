package com.lti.finance.core.daos;

import java.util.List;

import com.lti.finance.core.entities.EmiSchedule;
import com.lti.finance.core.entities.Purchase;
import com.lti.finance.core.exception.FinanceException;

public interface PurchaseProductDao {

	boolean setPurchaseProductDetails(Purchase purchase) throws FinanceException;

	List<EmiSchedule> getSchedules(int userId) throws FinanceException;
	
}
