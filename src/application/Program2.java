package application;

import java.util.List;
import java.util.Scanner;

import db.DB;
import model.dao.Dao;
import model.dao.DaoFactory;
import model.entities.Department;

/**
 * Main class of the program that performs CRUD operations on departments.
 */
public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dao<Department> departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("Department findById:");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\nDepartment findAll:");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\nDepartment insert:");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("\nDepartment update:");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update operation completed.");

        System.out.println("\nDepartment delete:");
        System.out.print("Enter the Id to delete: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete operation completed.");
        sc.close();

        DB.closeConnection();
    }
}
