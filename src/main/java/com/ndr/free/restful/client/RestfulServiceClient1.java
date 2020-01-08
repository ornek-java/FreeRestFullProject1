package com.ndr.free.restful.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RestfulServiceClient1 {

	public static void main(String[] args) {
		String url = "http://localhost:8080/FreeRestfulProject1/services/restfulService1";
		ClientConfig clientConfig = new DefaultClientConfig();
		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource(url);
        String response = webResource.path("getResponseAsString").get(String.class);
        System.out.println("Response:" + response);
	}
	
}
