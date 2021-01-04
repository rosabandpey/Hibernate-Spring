package com.demoSpringMvcHibernate.service;

import java.util.List;

import com.demoSpringMvcHibernate.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public void saveCustomer (Customer customer);
	public Customer getCustomers(int id);
	public Customer deleteCustomers(int id);
	

}
