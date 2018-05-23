package org.ordersample.orderservice.commandhandlers;

import org.ordersample.servicemodel.common.Channels;
import org.ordersample.servicemodel.order.api.commands.*;
import org.ordersample.servicemodel.order.api.info.*;
import org.ordersample.orderservice.impl.*;
import org.ordersample.orderservice.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import io.eventuate.tram.commands.consumer.CommandHandlers;
import io.eventuate.tram.commands.consumer.CommandMessage;
import io.eventuate.tram.messaging.common.Message;
import io.eventuate.tram.sagas.participant.SagaCommandHandlersBuilder;
import static io.eventuate.tram.commands.consumer.CommandHandlerReplyBuilder.withFailure;
import static io.eventuate.tram.commands.consumer.CommandHandlerReplyBuilder.withSuccess;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceCommandHandlers {

	private static final Logger log = LoggerFactory.getLogger(OrderServiceCommandHandlers.class);

	@Autowired
	private OrderServiceImpl orderServiceImpl;

	public CommandHandlers commandHandlers() {
		return SagaCommandHandlersBuilder
				.fromChannel(Channels.ORDERSERVICE)
				.onMessage(CompleteOrderCommand.class, this::handleCompleteOrderCommand)
				.onMessage(RejectOrderCommand.class, this::handleRejectOrderCommand)
				.onMessage(EditOrderCommand.class, this::handleEditOrderCommand)
				.build();
	}		
		
	private Message handleCompleteOrderCommand(CommandMessage<CompleteOrderCommand> cm) {
		log.info("handleCompleteOrderCommand() - OrderServiceCommandHandlers - OrderService");
		
		CompleteOrderCommand command = cm.getCommand();
		/*TODO*/
		return withSuccess();
	}

	private Message handleRejectOrderCommand(CommandMessage<RejectOrderCommand> cm) {
		log.info("handleRejectOrderCommand() - OrderServiceCommandHandlers - OrderService");
		
		RejectOrderCommand command = cm.getCommand();
		/*TODO*/
		return withSuccess();
	}

	private Message handleEditOrderCommand(CommandMessage<EditOrderCommand> cm) {
		log.info("handleEditOrderCommand() - OrderServiceCommandHandlers - OrderService");
		
		EditOrderCommand command = cm.getCommand();
		/*TODO*/
		return withSuccess();
	}

}
