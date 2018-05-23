package org.ordersample.orderviewservice.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Orders")
public class Order{

    private String id;									
    private String description;									
    private Customer customerid;									
    private Invoice invoiceid;									

	public Order() {}

	public void setId(String id) {
		this.id = id;
	}	

	public String getId() {
		return id;
	}
	public void setDescription(String description) {
		this.description = description;
	}	

	public String getDescription() {
		return description;
	}
	public void setCustomerId(Customer customerid) {
		this.customerid = customerid;
	}	

	public Customer getCustomerId() {
		return customerid;
	}
	public void setInvoiceId(Invoice invoiceid) {
		this.invoiceid = invoiceid;
	}	

	public Invoice getInvoiceId() {
		return invoiceid;
	}

}
