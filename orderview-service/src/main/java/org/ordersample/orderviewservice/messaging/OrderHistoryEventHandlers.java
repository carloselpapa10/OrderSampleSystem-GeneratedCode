package org.ordersample.orderviewservice.messaging;

import org.springframework.stereotype.Component;
import org.ordersample.servicemodel.order.api.events.*;
import org.ordersample.orderviewservice.impl.*;
import org.ordersample.orderviewservice.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.eventuate.tram.events.subscriber.DomainEventEnvelope;
import io.eventuate.tram.events.subscriber.DomainEventHandlers;
import io.eventuate.tram.events.subscriber.DomainEventHandlersBuilder;	

@Component
public class OrderHistoryEventHandlers {
	
	private static final Logger log = LoggerFactory.getLogger(OrderHistoryEventHandlers.class);

	public DomainEventHandlers domainEventHandlers() {
		return DomainEventHandlersBuilder
				.forAggregateType("org.ordersample.orderservice.model.Order")
				.onEvent(OrderCompletedEvent.class, this::handleOrderCompletedEvent)
				.onEvent(OrderCreatedEvent.class, this::handleOrderCreatedEvent)
				.onEvent(OrderRejectedEvent.class, this::handleOrderRejectedEvent)
				.onEvent(OrderEditedEvent.class, this::handleOrderEditedEvent)
				.onEvent(OrderDeletedEvent.class, this::handleOrderDeletedEvent)
				.onEvent(OrderUpdatedInvoiceEvent.class, this::handleOrderUpdatedInvoiceEvent)
				.build();
	}

	private void handleOrderCompletedEvent(DomainEventEnvelope<OrderCompletedEvent> dee) {
		log.info("handleOrderCompletedEvent() - OrderHistoryEventHandlers - OrderService");
	}

	private void handleOrderCreatedEvent(DomainEventEnvelope<OrderCreatedEvent> dee) {
		log.info("handleOrderCreatedEvent() - OrderHistoryEventHandlers - OrderService");
	}

	private void handleOrderRejectedEvent(DomainEventEnvelope<OrderRejectedEvent> dee) {
		log.info("handleOrderRejectedEvent() - OrderHistoryEventHandlers - OrderService");
	}

	private void handleOrderEditedEvent(DomainEventEnvelope<OrderEditedEvent> dee) {
		log.info("handleOrderEditedEvent() - OrderHistoryEventHandlers - OrderService");
	}

	private void handleOrderDeletedEvent(DomainEventEnvelope<OrderDeletedEvent> dee) {
		log.info("handleOrderDeletedEvent() - OrderHistoryEventHandlers - OrderService");
	}

	private void handleOrderUpdatedInvoiceEvent(DomainEventEnvelope<OrderUpdatedInvoiceEvent> dee) {
		log.info("handleOrderUpdatedInvoiceEvent() - OrderHistoryEventHandlers - OrderService");
	}

}
