package model.dao;

import java.util.List;

import model.entities.Department;
/* Interface DAO: Define as operações que podem ser realizadas nos dados, 
 * como inserir, atualizar, deletar e buscar. Essa interface é 
 * implementada por classes concretas que contêm o 
 * código específico para interagir com a base de dados.*/

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department>findAll();
}
