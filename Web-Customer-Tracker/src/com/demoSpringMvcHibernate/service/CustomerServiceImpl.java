package com.demoSpringMvcHibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoSpringMvcHibernate.dao.CustomerDao;
import com.demoSpringMvcHibernate.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(customer);
	}

	@Override
	@Transactional
	public Customer getCustomers(int id) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(id);
	}

	@Override
	@Transactional
	public Customer deleteCustomers(int id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(id);
	}

}
