package com.lti.finance.core.daos;

import com.lti.finance.core.entities.Product;

public interface ProductDao {
	public Product getProductDetails(int productId);
}
