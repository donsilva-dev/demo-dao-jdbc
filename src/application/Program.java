package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(" ==== Teste 1: seller findByd ====");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);
		
		System.out.println(" \n==== Teste 2: seller findByd ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByIdDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
			
		}

		System.out.println(" \n==== Teste 3: seller findAll ====");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj); 
			
		}
		
		System.out.println(" \n==== Teste 4: seller insert ====");
		Seller newSeller = new Seller(null, "Estefany", "estefany@teste.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println(" \n==== Teste 5: seller Update ====");
		seller = sellerDao.findById(5);
		seller.setName("Francisco");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println(" \n==== Teste 6: seller Delete ====");
		
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete complete!");
		
		sc.close();
	}

}
