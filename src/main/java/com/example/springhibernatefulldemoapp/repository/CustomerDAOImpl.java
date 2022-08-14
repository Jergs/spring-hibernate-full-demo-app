package com.example.springhibernatefulldemoapp.repository;

import com.example.springhibernatefulldemoapp.entity.Customer;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
public class CustomerDAOImpl implements CustomerDAO {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        try (Session session = sessionFactory.openSession()) {
            Query<Customer> query = session.createQuery("FROM Customer", Customer.class);
            return query.getResultList();
        }
    }
}
