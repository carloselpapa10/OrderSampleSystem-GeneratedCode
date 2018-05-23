package org.ordersample.orderservice.controller;

import org.ordersample.orderservice.impl.*;
import org.ordersample.orderservice.model.*;
import org.ordersample.orderservice.webapi.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class OrderServiceController {

	private static final Logger log = LoggerFactory.getLogger(OrderServiceController.class);

	@Autowired
	private OrderServiceImpl orderServiceImpl;

	@PostMapping("/order")
	public CreateOrderResponse createOrder(@RequestBody CreateOrderRequest createOrderRequest){
		log.info("createOrder(@RequestBody CreateOrderRequest createOrderRequest) - OrderServiceController - OrderService");
		
		/*TODO*/
		return new CreateOrderResponse();
	}
			
	@GetMapping("/retrieve/{orderId}")
	public Order findOrder(@RequestParam String id){
		log.info("findOrder(String id) - OrderServiceController - OrderService");
		
		/*TODO*/
		return null;
	} 			

	@PutMapping("/update/order")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order){
		log.info("updateOrder(@RequestBody Order order) - OrderServiceController - OrderService");

		/*TODO*/
		return null;
	}
 			
	@DeleteMapping("/delete/{orderId}")
	public String deleteOrder(@RequestParam String id){
		log.info("deleteOrder(String id) - OrderServiceController - OrderService");

		/*TODO*/
		return null;
	} 
			
	@GetMapping("/retrieve/Orders")
	public List<Order> findAllOrders(){
		/*Auto-Generated*/
		log.info("findAll() - OrderServiceController - OrderService");
		return orderServiceImpl.findAll();
	}

}


