package com.demoSpringMvcHibernate.dao;

import java.util.List;
import com.demoSpringMvcHibernate.entity.Customer;

public interface CustomerDao {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public Customer deleteCustomer(int id);
	
}
