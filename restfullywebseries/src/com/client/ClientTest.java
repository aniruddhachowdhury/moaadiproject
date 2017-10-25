package com.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class ClientTest {

	public static void main(String[] args) 
	{
		ClientConfig config=new ClientConfig();
		Client client=ClientBuilder.newClient(config);
		WebTarget target=client.target(getBaseUri());
		
		System.out.println(target.path("restfully").path("webservices123").request().accept(MediaType.TEXT_PLAIN).get(String.class));
		
		System.out.println(target.path("restfully").path("webservices123").request().accept(MediaType.TEXT_HTML).get(String.class));
		
		System.out.println(target.path("restfully").path("webservices123").request().accept(MediaType.TEXT_XML).get(String.class));
		

	}
	
	private static URI getBaseUri()
	{
		return UriBuilder.fromUri("http://localhost:8080/restfullyjersey").build();
	}

}
