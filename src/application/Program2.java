package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n === TEST 1: department insert ===");
		Department dep = new Department(5 ,"Food");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
		
		System.out.println("\n === TEST 2: department update ===");
		Department dep2 = new Department(2 ,"Kitchen");
		departmentDao.update(dep2);
		System.out.println("Updated");
		
		System.out.println("\n === TEST 3: department delete ===");
		departmentDao.deleteById(3);
		System.out.println("Delete completed");
		
		System.out.println("\n === TEST 4: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n === TEST 5: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department i : list) {
			System.out.println(i);
		}
	}

}
