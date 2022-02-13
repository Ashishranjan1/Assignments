package com.service;

import java.util.List;
import java.util.Optional;

import com.exception.DataAccessException;
import com.persistence.Product;
import com.persistence.ProductDao;
import com.persistence.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{

	private ProductDao productdao=null;
	public ProductServiceImpl() {
		productdao=new ProductDaoImpl();
	}

	@Override
	public Product addProduct(Product product) {
		return productdao.addProduct(product);
	}

	@Override
	public Product deleteProduct(int id) {
		return productdao.deleteProduct(id);
	}

	@Override
	public Product updateProduct(int id, Product product) {
		return productdao.updateProduct(id, product);
	}

	@Override
	public List<Product> getAll() throws DataAccessException {
		return productdao.getAll();
	}

	@Override
	public Product getById(int id) {
		return productdao.getById(id);
	}

}