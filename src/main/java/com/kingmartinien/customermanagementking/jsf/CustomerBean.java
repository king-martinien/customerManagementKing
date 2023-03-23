/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.kingmartinien.customermanagementking.jsf;

import com.kingmartinien.customermanagementking.ejb.CustomerManager;
import com.kingmartinien.customermanagementking.entities.Customer;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 * Baking bean of the customerList.xhtml page
 *
 * @author kingmartinien
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {

    private List<Customer> customerList;
    @EJB
    private CustomerManager customerManager;

    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }

    public List<Customer> getCustomerList() {
        System.out.println("Getting The list of customers....");
        return customerManager.getAllCustomers();
    }
}
