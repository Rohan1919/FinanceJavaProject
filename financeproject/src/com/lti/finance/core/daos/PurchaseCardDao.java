package com.lti.finance.core.daos;

import com.lti.finance.core.entities.PurchaseCard;

public interface PurchaseCardDao {

	public boolean setPurchaseCardDetails(PurchaseCard pcard);

	public PurchaseCard  getPurchaseCardDetails(int pcardNo);

}
