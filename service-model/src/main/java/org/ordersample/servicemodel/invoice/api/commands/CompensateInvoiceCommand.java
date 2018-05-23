package org.ordersample.servicemodel.invoice.api.commands;

import java.util.List;
import io.eventuate.tram.commands.common.Command;
import org.ordersample.servicemodel.invoice.api.info.*;

public class CompensateInvoiceCommand implements Command{

	private InvoiceInfo invoiceInfo;
	
	public CompensateInvoiceCommand() {}

	public CompensateInvoiceCommand(InvoiceInfo invoiceInfo) {
		super();
		this.invoiceInfo = invoiceInfo;
	}

	public InvoiceInfo getInvoiceInfo() {
		return invoiceInfo;
	}

	public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

}
