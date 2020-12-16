package app;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDep {
	
	
	public static void main(String[] args) {
		
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department.findById ===");
		Department Department = DepartmentDao.findById(3);
		System.out.println(Department);
		
		System.out.println("\n=== TEST 2: Department.findAll ===");
		List<Department> allDepartments = DepartmentDao.findAll();
		for (Department s: allDepartments) {
			System.out.println(s);			
		}
		
		System.out.println("\n=== TEST 3: Department.insert ===");
		Department newDepartment = new Department(null, "Fun");
		DepartmentDao.insert(newDepartment);
		System.out.println("Inserted! New ID = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 4: Department.update ===");
		Department = DepartmentDao.findById(4);
		Department.setName("EBooks");
		DepartmentDao.update(Department);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 5: Department.deleteById ===");
		DepartmentDao.deleteById(5);
		System.out.println("Deleted!");
	}

}
