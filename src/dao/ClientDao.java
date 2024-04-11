package dao;

import java.util.List;

import entities.Client;

public interface ClientDao {

	public void insert(Client obj);
	public void update(Client obj);
	public void delete(Integer id);
	public Client findById(Integer id);
	public List<Client> findAll();
}
