package com.service;


import java.util.List;
import java.util.Optional;

import com.exception.DataAccessException;
import com.persistence.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public Product deleteProduct(int id);
	public Product updateProduct(int id , Product product);
	public List<Product> getAll()throws DataAccessException;
	public Product getById(int id);
}