package com.lti.finance.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.core.entities.Product;

import com.lti.finance.core.exception.FinanceException;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@PersistenceContext
	private EntityManager manager;
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public Product getProductDetails(int productId)throws FinanceException {
		
		Product product=manager.find(Product.class,productId);
		return product;
	}
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean setProductDetails(Product product) throws FinanceException{
		manager.merge(product);
		return true;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<Product> getProductDetailsByType(String productType) throws FinanceException {
		// TODO Auto-generated method stub
		Query qry=manager.createQuery("select p from Product p where p.productType=:productType");
		qry.setParameter("productType", productType);
		return qry.getResultList();
	}
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<Product> getUserProducts(int userId) throws FinanceException {
		Query qry=manager.createQuery("select p.productId,p.productName,p.price,r.purchaseId,r.transactionDate,r.totalAmount from Purchase r join r.product p  where r.userId=:userid");
		qry.setParameter("userid", userId);
		List<Product> plist=qry.getResultList();
		return (ArrayList<Product>)plist;
	}
}
