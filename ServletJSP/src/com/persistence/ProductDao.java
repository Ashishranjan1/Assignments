package com.persistence;


import java.util.List;
import java.util.Optional;

import com.exception.DataAccessException;

public interface ProductDao {
	public Product addProduct(Product product);
	public Product deleteProduct(int id);
	public Product updateProduct(int id , Product product);
	public List<Product> getAll()throws DataAccessException;
	public Product getById(int id);
}