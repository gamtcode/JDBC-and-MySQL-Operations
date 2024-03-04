package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

/**
 * DAO interface for Seller-specific operations.
 * Extends the generic Dao interface with Seller-specific methods.
 */
public interface SellerDao extends Dao<Seller> {

    /**
     * Finds all sellers in a specific department.
     * @param department the department to find sellers in
     * @return a list of sellers in the specified department
     */
    List<Seller> findByDepartment(Department department);

}
