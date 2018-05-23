package org.ordersample.servicemodel.invoice.api.info;

import java.util.ArrayList;
import java.util.List;

public class InvoiceInfo {

    private String id;									
    private String orderid;									
    private String invoicecomment;									

	public InvoiceInfo(){}

	public void setId(String id){
		this.id = id;
	}	

	public String getId() {
		return id;
	}
	public void setOrderId(String orderid){
		this.orderid = orderid;
	}	

	public String getOrderId() {
		return orderid;
	}
	public void setInvoiceComment(String invoicecomment){
		this.invoicecomment = invoicecomment;
	}	

	public String getInvoiceComment() {
		return invoicecomment;
	}
}			
