package com.example.springhibernatefulldemoapp.repository;

import com.example.springhibernatefulldemoapp.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Slf4j
public class CustomerDAOImpl implements CustomerDAO {

    private final EntityManager entityManager;

    public CustomerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Customer> getCustomers() {
        return entityManager.createQuery("FROM Customer", Customer.class).getResultList();
    }

    @Override
    public void saveCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        entityManager.merge(customer);
    }

    @Override
    public Customer getCustomer(Integer id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public void deleteCustomer(Integer id) {
        Customer customer = entityManager.find(Customer.class, id);
        entityManager.remove(customer);
        flushAndClear();
    }

    private void flushAndClear() {
        entityManager.flush();
        entityManager.clear();
    }
}
