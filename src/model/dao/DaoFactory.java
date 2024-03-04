package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;

/**
 * Factory class for creating instances of DAO classes.
 */
public class DaoFactory {

    /**
     * Creates a new SellerDao instance.
     * @return a new SellerDao instance
     */
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    /**
     * Creates a new Dao<Department> instance.
     * @return a new Dao<Department> instance
     */
    public static Dao<Department> createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
