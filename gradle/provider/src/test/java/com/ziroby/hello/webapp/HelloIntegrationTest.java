package com.ziroby.hello.webapp;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import org.junit.Test;

public class HelloIntegrationTest {
	private static String HELLO_URL = "http://localhost:9090/hello";
	private static String KIRIM_SMS_URL = "http://localhost:9090/kirimSMS";
	private static String TERIMA_SMS_URL = "http://localhost:9090/terimaSMS";
	
	@Test
	public void testHello() throws Exception {
		Client client = Client.create();
		WebResource webResource = client.resource(HELLO_URL);
		String response = webResource.get(String.class);
		
		assertThat(response, is("Hello, World!"));
	}

	@Test
	public void testKirimSMS() throws Exception {
		Client client = Client.create();
		WebResource webResource = client.resource(KIRIM_SMS_URL);
		String response = webResource.get(String.class);
		
		assertThat(response, is("berhasil"));
	}

	@Test
	public void testTerimaSMS() throws Exception {
		Client client = Client.create();
		WebResource webResource = client.resource(TERIMA_SMS_URL);
		String response = webResource.get(String.class);
		
		assertThat(response, is("ok"));
	}
}
