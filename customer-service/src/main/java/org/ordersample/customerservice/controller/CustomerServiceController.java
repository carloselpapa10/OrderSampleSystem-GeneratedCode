package org.ordersample.customerservice.controller;

import org.ordersample.customerservice.impl.*;
import org.ordersample.customerservice.model.*;
import org.ordersample.customerservice.webapi.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CustomerServiceController {

	private static final Logger log = LoggerFactory.getLogger(CustomerServiceController.class);

	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@PostMapping("/customer")
	public CreateCustomerResponse createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest){
		log.info("createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest) - CustomerServiceController - CustomerService");
		
		/*TODO*/
		return new CreateCustomerResponse();
	}
			
	@GetMapping("/retrieve/{customerId}")
	public Customer findCustomer(@RequestParam String id){
		log.info("findCustomer(String id) - CustomerServiceController - CustomerService");
		
		/*TODO*/
		return null;
	} 			

	@PutMapping("/update/customer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		log.info("updateCustomer(@RequestBody Customer customer) - CustomerServiceController - CustomerService");

		/*TODO*/
		return null;
	}
 			
	@DeleteMapping("/delete/{customerId}")
	public String deleteCustomer(@RequestParam String id){
		log.info("deleteCustomer(String id) - CustomerServiceController - CustomerService");

		/*TODO*/
		return null;
	} 
			
	@GetMapping("/retrieve/Customers")
	public List<Customer> findAllCustomers(){
		/*Auto-Generated*/
		log.info("findAll() - CustomerServiceController - CustomerService");
		return customerServiceImpl.findAll();
	}

}


