package app;

import java.util.Date;
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
		
		System.out.println("\n=== TEST 4: Seller.insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(2, null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New ID = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: Seller.update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 6: Seller.deleteById ===");
		sellerDao.deleteById(11);
		System.out.println("Deleted!");
	}

}
