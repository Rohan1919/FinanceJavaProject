package com.lti.finance.core.daos;

import com.lti.finance.core.entities.Purchase;
import com.lti.finance.core.exception.FinanceException;

public interface PurchaseProductDao {

	boolean setPurchaseProductDetails(Purchase purchase) throws FinanceException;
	
}
