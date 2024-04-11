package dao;

import java.util.List;

import entities.Product;

public interface ProductDao {

	public void insert(Product obj);
	public void update(Product obj);
	public void delete(Integer id);
	public Product findById(Integer id);
	public List<Product> findAll();
}
