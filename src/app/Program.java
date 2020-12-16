package app;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller.findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller.findByDepartment ===");
		List<Seller> sellersByDepartment = sellerDao.findByDepartment(new Department(2, null));
		for (Seller s: sellersByDepartment) {
			System.out.println(s);			
		}
		
		System.out.println("\n=== TEST 3: Seller.findAll ===");
		List<Seller> allSellers = sellerDao.findAll();
		for (Seller s: allSellers) {
			System.out.println(s);			
		}
	}

}
