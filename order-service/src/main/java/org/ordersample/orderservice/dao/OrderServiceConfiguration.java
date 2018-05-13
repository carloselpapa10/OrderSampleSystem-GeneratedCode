package org.ordersample.orderservice.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import io.eventuate.tram.commands.common.ChannelMapping;
import io.eventuate.tram.commands.common.DefaultChannelMapping;
import io.eventuate.tram.events.publisher.TramEventsPublisherConfiguration;
import io.eventuate.tram.sagas.participant.SagaParticipantConfiguration;
import io.eventuate.tram.sagas.orchestration.SagaManager;
import io.eventuate.tram.sagas.orchestration.SagaManagerImpl;
import io.eventuate.tram.sagas.orchestration.SagaOrchestratorConfiguration;
import org.ordersample.orderservice.saga.createorder.CreateOrderSaga;
import org.ordersample.orderservice.saga.createorder.CreateOrderSagaData;
import org.ordersample.orderservice.saga.updateorder.UpdateOrderSaga;
import org.ordersample.orderservice.saga.updateorder.UpdateOrderSagaData;

@Configuration
@Import({ SagaParticipantConfiguration.class, TramEventsPublisherConfiguration.class, SagaOrchestratorConfiguration.class })
public class OrderServiceConfiguration {

	@Bean
	public ChannelMapping channelMapping() {
	    return new DefaultChannelMapping.DefaultChannelMappingBuilder().build();
	}

	@Bean
	public SagaManager<CreateOrderSagaData> createOrderSagaManager(CreateOrderSaga saga){
		return new SagaManagerImpl<>(saga);
	}

	@Bean
	public SagaManager<UpdateOrderSagaData> updateOrderSagaManager(UpdateOrderSaga saga){
		return new SagaManagerImpl<>(saga);
	}

}
		
