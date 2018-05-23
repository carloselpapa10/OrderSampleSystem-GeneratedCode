package org.ordersample.servicemodel.order.api.info;

import java.util.ArrayList;
import java.util.List;

public class OrderInfo {

    private String id;									
    private String description;									
    private String customerid;									
    private String invoiceid;									

	public OrderInfo(){}

	public void setId(String id){
		this.id = id;
	}	

	public String getId() {
		return id;
	}
	public void setDescription(String description){
		this.description = description;
	}	

	public String getDescription() {
		return description;
	}
	public void setCustomerId(String customerid){
		this.customerid = customerid;
	}	

	public String getCustomerId() {
		return customerid;
	}
	public void setInvoiceId(String invoiceid){
		this.invoiceid = invoiceid;
	}	

	public String getInvoiceId() {
		return invoiceid;
	}
}			
