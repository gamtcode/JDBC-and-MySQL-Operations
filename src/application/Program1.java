package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

/**
 * Main class of the program that performs CRUD operations on sellers.
 */
public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Seller findById:");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\nSeller findByDepartment:");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\nSeller findAll:");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\nSeller insert:");
        Seller newSeller = new Seller(null, "John", "johnsmith@gmail.com", LocalDate.parse("25/06/2001",
                DateTimeFormatter.ofPattern("dd/MM/yyyy")), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id: " + newSeller.getId());

        System.out.println("\nSeller update:");
        seller = sellerDao.findById(1);
        seller.setName("Emily Johnson");
        sellerDao.update(seller);
        System.out.println("Update operation completed.");

        System.out.println("\nSeller delete:");
        System.out.print("Enter the Id to delete: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete operation completed.");
        sc.close();

        DB.closeConnection();
    }
}
