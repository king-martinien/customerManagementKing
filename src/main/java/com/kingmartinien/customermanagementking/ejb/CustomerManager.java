/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kingmartinien.customermanagementking.ejb;

import com.kingmartinien.customermanagementking.entities.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * This class manage the Customer persistence
 *
 * @author kingmartinien
 */
@Stateless
public class CustomerManager {

    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    /**
     * Get All the customers stored in the database
     *
     * @return a list of customers
     */
    public List<Customer> getAllCustomers() {
        Query query = em.createNamedQuery("Customer.findAll");
        return query.getResultList();
    }

    /**
     * update a customer in the database
     *
     * @param customer The new customer object
     * @return The updated customer
     */
    public Customer update(Customer customer) {
        return em.merge(customer);
    }

    /**
     * Insert a new customer in the database
     *
     * @param customer The new customer to insert
     */
    public void persit(Customer customer) {
        em.persist(customer);
    }
}
