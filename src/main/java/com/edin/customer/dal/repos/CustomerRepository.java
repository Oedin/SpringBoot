package com.edin.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.edin.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
