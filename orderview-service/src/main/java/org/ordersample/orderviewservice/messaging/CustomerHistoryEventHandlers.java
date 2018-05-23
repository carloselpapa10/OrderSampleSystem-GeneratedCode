package org.ordersample.orderviewservice.messaging;

import org.springframework.stereotype.Component;
import org.ordersample.servicemodel.customer.api.events.*;
import org.ordersample.orderviewservice.impl.*;
import org.ordersample.orderviewservice.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.eventuate.tram.events.subscriber.DomainEventEnvelope;
import io.eventuate.tram.events.subscriber.DomainEventHandlers;
import io.eventuate.tram.events.subscriber.DomainEventHandlersBuilder;	

@Component
public class CustomerHistoryEventHandlers {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerHistoryEventHandlers.class);

	public DomainEventHandlers domainEventHandlers() {
		return DomainEventHandlersBuilder
				.forAggregateType("org.ordersample.customerservice.model.Customer")
				.onEvent(CustomerCreatedEvent.class, this::handleCustomerCreatedEvent)
				.onEvent(CustomerDeletedEvent.class, this::handleCustomerDeletedEvent)
				.onEvent(CustomerUpdatedEvent.class, this::handleCustomerUpdatedEvent)
				.build();
	}

	private void handleCustomerCreatedEvent(DomainEventEnvelope<CustomerCreatedEvent> dee) {
		log.info("handleCustomerCreatedEvent() - CustomerHistoryEventHandlers - CustomerService");
	}

	private void handleCustomerDeletedEvent(DomainEventEnvelope<CustomerDeletedEvent> dee) {
		log.info("handleCustomerDeletedEvent() - CustomerHistoryEventHandlers - CustomerService");
	}

	private void handleCustomerUpdatedEvent(DomainEventEnvelope<CustomerUpdatedEvent> dee) {
		log.info("handleCustomerUpdatedEvent() - CustomerHistoryEventHandlers - CustomerService");
	}

}
