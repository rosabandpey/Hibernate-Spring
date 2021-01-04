package com.demoSpringMvcHibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demoSpringMvcHibernate.entity.Customer;


@Repository
public class CustomerDAOImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.getCurrentSession();
		
		Query<Customer> query=session.createQuery("from Customer order by lastName",Customer.class);
		List<Customer>  customers=query.getResultList();
		
		
		return customers;
	}


	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
		
	}


	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Customer customer=session.get(Customer.class, id);
		
		return customer;
	}


	@Override
	public Customer deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		
		Query query=session.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", id);
		query.executeUpdate();
		return null;
	}

}
