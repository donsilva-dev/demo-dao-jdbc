package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	/* Interface DAO: Define as operações que podem ser realizadas nos dados, 
	 * como inserir, atualizar, deletar e buscar. Essa interface é 
	 * implementada por classes concretas que contêm o 
	 * código específico para interagir com a base de dados.*/

	void insert(SellerDao obj);
	void update(SellerDao obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<SellerDao>findAll();
}
