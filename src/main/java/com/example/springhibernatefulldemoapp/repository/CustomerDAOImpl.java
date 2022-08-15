package com.example.springhibernatefulldemoapp.repository;

import com.example.springhibernatefulldemoapp.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
@AllArgsConstructor
public class CustomerDAOImpl implements CustomerDAO {

    private final SessionFactory sessionFactory;


    @Override
    public List<Customer> getCustomers() {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Query<Customer> query = session.createQuery("from Customer", Customer.class);
            transaction.commit();
            return query.getResultList();
        }
    }

    @Override
    public void saveCustomer(Customer customer) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(customer);
            transaction.commit();
        }
    }

    @Override
    public Customer getCustomer(Integer id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Customer customer = session.get(Customer.class, id);
            transaction.commit();
            return customer;
        }
    }

    @Override
    public void deleteCustomer(Integer id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("delete from Customer where id=:customerId");
            query.setParameter("customerId", id);
            query.executeUpdate();

            transaction.commit();
        }
    }
}
