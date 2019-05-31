package com.rajesh.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.rajesh.camel.constants.ServiceConstants;
import com.rajesh.camel.processor.HelloProcessor;

@Component
public class HelloRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from(ServiceConstants.HELLO_SERVICE_ENDPOINT)
		.id(ServiceConstants.HELLO_ROUTE_ID)
		.log("I'm in the Camel Route!")
		.process(new HelloProcessor());
		
	}
}
