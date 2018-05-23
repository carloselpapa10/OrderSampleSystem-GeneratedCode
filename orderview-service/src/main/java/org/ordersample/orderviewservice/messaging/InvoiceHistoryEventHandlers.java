package org.ordersample.orderviewservice.messaging;

import org.springframework.stereotype.Component;
import org.ordersample.servicemodel.invoice.api.events.*;
import org.ordersample.orderviewservice.impl.*;
import org.ordersample.orderviewservice.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.eventuate.tram.events.subscriber.DomainEventEnvelope;
import io.eventuate.tram.events.subscriber.DomainEventHandlers;
import io.eventuate.tram.events.subscriber.DomainEventHandlersBuilder;	

@Component
public class InvoiceHistoryEventHandlers {
	
	private static final Logger log = LoggerFactory.getLogger(InvoiceHistoryEventHandlers.class);

	public DomainEventHandlers domainEventHandlers() {
		return DomainEventHandlersBuilder
				.forAggregateType("org.ordersample.invoiceservice.model.Invoice")
				.onEvent(InvoiceCreatedEvent.class, this::handleInvoiceCreatedEvent)
				.onEvent(InvoiceCreationFailedEvent.class, this::handleInvoiceCreationFailedEvent)
				.build();
	}

	private void handleInvoiceCreatedEvent(DomainEventEnvelope<InvoiceCreatedEvent> dee) {
		log.info("handleInvoiceCreatedEvent() - InvoiceHistoryEventHandlers - InvoiceService");
	}

	private void handleInvoiceCreationFailedEvent(DomainEventEnvelope<InvoiceCreationFailedEvent> dee) {
		log.info("handleInvoiceCreationFailedEvent() - InvoiceHistoryEventHandlers - InvoiceService");
	}

}
