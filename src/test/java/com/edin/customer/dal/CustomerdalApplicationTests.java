package com.edin.customer.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edin.customer.dal.entities.Customer;
import com.edin.customer.dal.repos.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Test
	public void createCustomer() {
		
		Customer customer = new Customer();
		customer.setName("John");
		customer.setEmail("haha@gmail.com");
		
		customerRepository.save(customer);
	}
	
	@Test
	public void findCustmer() {
		Customer customer = customerRepository.findOne((long) 1);
		System.out.println(customer);
	}
	
	@Test
	public void updateCustmer() {
		Customer customer = customerRepository.findOne((long) 2);
		customer.setName("Brian");
		customer.setEmail("abc@hotmail.com");
		customerRepository.save(customer);
		
	}
	
	@Test
	public void deleteCustomer() {
		Customer customer = customerRepository.findOne((long) 5);
		customerRepository.delete(customer);
	}

}
