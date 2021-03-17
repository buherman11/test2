package com.budiartoherman.test2;

import org.springframework.data.repository.CrudRepository;

import com.budiartoherman.test2.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}