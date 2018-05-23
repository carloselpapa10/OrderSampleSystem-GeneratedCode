package org.ordersample.orderservice.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Orders")
public class Order{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)						
	private String id; 
    private String description;									
    private String customerid;									
    private String invoiceid;									
				
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
	public void setCustomerId(String customerid) {
		this.customerid = customerid;
	}	

	public String getCustomerId() {
		return customerid;
	}
	public void setInvoiceId(String invoiceid) {
		this.invoiceid = invoiceid;
	}	

	public String getInvoiceId() {
		return invoiceid;
	}

}
