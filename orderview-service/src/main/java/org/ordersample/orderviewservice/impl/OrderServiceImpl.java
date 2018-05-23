package org.ordersample.orderviewservice.impl;

import org.ordersample.servicemodel.common.BusinessException;
import org.ordersample.servicemodel.order.api.events.*;
import org.ordersample.servicemodel.order.api.info.*;
import org.ordersample.orderviewservice.dao.OrderService;
import org.ordersample.orderviewservice.model.*;
import org.ordersample.orderviewservice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static java.util.Collections.singletonList;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import io.eventuate.tram.events.aggregates.ResultWithDomainEvents;

@Component
@Transactional
public class OrderServiceImpl implements OrderService{

	private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order createOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("createOrder(Order order) - OrderServiceImpl - OrderViewService");
		return order;
	}
				
	@Override
	public Order findOrder(String id) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("findOrder(String id) - OrderServiceImpl - OrderViewService");
		return null;
	}
			
	@Override
	public void updateOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("updateOrder(Order order) - OrderServiceImpl - OrderViewService");
	}
			
	@Override
	public void rejectOrder(String id) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("rejectOrder(String id) - OrderServiceImpl - OrderViewService");
	}
			
	@Override
	public void completeOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("completeOrder(Order order) - OrderServiceImpl - OrderViewService");
	}
			
	@Override
	public void editOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("editOrder(Order order) - OrderServiceImpl - OrderViewService");
	}
			
	@Override
	public void deleteOrder(String id) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("deleteOrder(String id) - OrderServiceImpl - OrderViewService");
	}
			
	@Override
	public void updateInvoiceOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("updateInvoiceOrder(Order order) - OrderServiceImpl - OrderViewService");
	}
			
	@Override
	public List<Order> findAll() throws BusinessException{
		log.info("findAll() - OrderServiceImpl - OrderViewService");
		return orderRepository.findAll();
	}

}
