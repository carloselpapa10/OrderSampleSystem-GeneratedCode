package org.ordersample.servicemodel.customer.api.events;

import org.ordersample.servicemodel.customer.api.info.*;

public class CustomerCreatedEvent implements CustomerDomainEvent{
	
	private CustomerInfo customerInfo;

	public CustomerCreatedEvent() {}

	public CustomerCreatedEvent(CustomerInfo customerInfo) {
		super();
		this.customerInfo = customerInfo;
	}

	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

}
