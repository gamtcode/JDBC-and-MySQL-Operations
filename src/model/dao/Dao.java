package model.dao;

import java.util.List;

/**
 * Generic DAO interface for CRUD operations.
 * @param <T> the type of the entity
 */
public interface Dao<T> {

    /**
     * Finds an entity by its ID.
     * @param id the ID of the entity
     * @return the entity if found, null otherwise
     */
    T findById(Integer id);

    /**
     * Finds all entities.
     * @return a list of all entities
     */
    List<T> findAll();

    /**
     * Inserts a new entity.
     * @param obj the entity to insert
     */
    void insert(T obj);

    /**
     * Updates an existing entity.
     * @param obj the entity to update
     */
    void update(T obj);

    /**
     * Deletes an entity by its ID.
     * @param id the ID of the entity
     */
    void deleteById(Integer id);
}
