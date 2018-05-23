package org.ordersample.servicemodel.customer.api.events;

import org.ordersample.servicemodel.customer.api.info.*;

public class CustomerDeletedEvent implements CustomerDomainEvent{
	
	private CustomerInfo customerInfo;

	public CustomerDeletedEvent() {}

	public CustomerDeletedEvent(CustomerInfo customerInfo) {
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
