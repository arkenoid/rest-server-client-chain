package com.ziroby.hello.webapp;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import org.junit.Test;

public class HelloIntegrationTest {
	private static String HELLO_URL = "http://localhost:9191/hello";
	private static String POLL_RESULT_URL = "http://localhost:9191/pollResult";
	
	@Test
	public void testHello() throws Exception {
		Client client = Client.create();
		WebResource webResource = client.resource(HELLO_URL);
		String response = webResource.get(String.class);
		
		assertThat(response, is("Hello, World!"));
	}
	
	@Test
	public void testPollResult() throws Exception {
		Client client = Client.create();
		WebResource webResource = client.resource(POLL_RESULT_URL);
		String response = webResource.get(String.class);
		
		assertThat(response, is("thanks"));
	}
}
