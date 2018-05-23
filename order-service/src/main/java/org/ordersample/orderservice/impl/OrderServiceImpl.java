package org.ordersample.orderservice.impl;

import org.ordersample.servicemodel.common.BusinessException;
import org.ordersample.servicemodel.order.api.events.*;
import org.ordersample.servicemodel.order.api.info.*;
import org.ordersample.orderservice.dao.OrderService;
import org.ordersample.orderservice.model.*;
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
import org.ordersample.orderservice.saga.createorder.CreateOrderSagaData;
import org.ordersample.orderservice.saga.updateorder.UpdateOrderSagaData;
import io.eventuate.tram.sagas.orchestration.SagaManager;

@Component
@Transactional
public class OrderServiceImpl implements OrderService{

	private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderDomainEventPublisher orderAggregateEventPublisher;

	@Autowired
	private SagaManager<CreateOrderSagaData> createOrderSagaManager;

	@Autowired
	private SagaManager<UpdateOrderSagaData> updateOrderSagaManager;

	@Override
	public Order createOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("createOrder(Order order) - OrderServiceImpl - OrderService");
		
		List<OrderDomainEvent> events = singletonList(new OrderCreatedEvent());
		ResultWithDomainEvents<Order, OrderDomainEvent> orderAndEvents = new ResultWithDomainEvents<>(order, events);		
		
		order = orderRepository.save(order);
		orderAggregateEventPublisher.publish(order, orderAndEvents.events);

		CreateOrderSagaData data = new CreateOrderSagaData();
		createOrderSagaManager.create(data, Order.class, order.getId());
		
		return order;
	}
				
	@Override
	public Order findOrder(String id) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("findOrder(String id) - OrderServiceImpl - OrderService");
		return null;
	}
			
	@Override
	public void updateOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("updateOrder(Order order) - OrderServiceImpl - OrderService");

		UpdateOrderSagaData data = new UpdateOrderSagaData();
		updateOrderSagaManager.create(data);
		
	}
			
	@Override
	public void rejectOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("rejectOrder(Order order) - OrderServiceImpl - OrderService");
		
		List<OrderDomainEvent> events = singletonList(new OrderRejectedEvent());
		ResultWithDomainEvents<Order, OrderDomainEvent> orderAndEvents = new ResultWithDomainEvents<>(order, events);
		
		orderRepository.delete(order);
		orderAggregateEventPublisher.publish(order, orderAndEvents.events);
		
	}
			
	@Override
	public void completeOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("completeOrder(Order order) - OrderServiceImpl - OrderService");

		List<OrderDomainEvent> events = singletonList(new OrderCompletedEvent());
		ResultWithDomainEvents<Order, OrderDomainEvent> orderAndEvents = new ResultWithDomainEvents<>(order, events);		
		orderAggregateEventPublisher.publish(order, orderAndEvents.events);

	}
			
	@Override
	public void editOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("editOrder(Order order) - OrderServiceImpl - OrderService");

		List<OrderDomainEvent> events = singletonList(new OrderEditedEvent());
		ResultWithDomainEvents<Order, OrderDomainEvent> orderAndEvents = new ResultWithDomainEvents<>(order, events);		
		orderAggregateEventPublisher.publish(order, orderAndEvents.events);

	}
			
	@Override
	public void deleteOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("deleteOrder(Order order) - OrderServiceImpl - OrderService");
		
		List<OrderDomainEvent> events = singletonList(new OrderDeletedEvent());
		ResultWithDomainEvents<Order, OrderDomainEvent> orderAndEvents = new ResultWithDomainEvents<>(order, events);
		
		orderRepository.delete(order);
		orderAggregateEventPublisher.publish(order, orderAndEvents.events);
		
	}
			
	@Override
	public void updateInvoiceOrder(Order order) throws BusinessException{
		// TODO Auto-generated method stub
		log.info("updateInvoiceOrder(Order order) - OrderServiceImpl - OrderService");

		List<OrderDomainEvent> events = singletonList(new OrderUpdatedInvoiceEvent());
		ResultWithDomainEvents<Order, OrderDomainEvent> orderAndEvents = new ResultWithDomainEvents<>(order, events);		
		orderAggregateEventPublisher.publish(order, orderAndEvents.events);

	}
			
	@Override
	public List<Order> findAll() throws BusinessException{
		log.info("findAll() - OrderServiceImpl - OrderService");
		return orderRepository.findAll();
	}
	
}
