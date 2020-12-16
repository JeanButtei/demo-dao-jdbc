package app;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dept = new Department(1, "Books");
		Seller seller = new Seller(30, "Zé", "email@gmail.com", new Date(), 3000.0, dept);
		
		System.out.println(dept);
		System.out.println(seller);

	}

}
