package com.ndr.free.restful.client;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.ndr.free.restful.model.Request;
import com.ndr.free.restful.model.Response;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RestfulServiceClient3{
    

    public static void main(String[] args)    {
    	String url = "http://localhost:8080/FreeRestfulProject1/services/restfulService3";
    	ClientConfig clientConfig = new DefaultClientConfig();
    	clientConfig.getFeatures().put(ClientConfig.FEATURE_DISABLE_XML_SECURITY, true);
    	clientConfig.getClasses().add(JacksonJsonProvider.class);
        Client client = Client.create(clientConfig);
        WebResource webResource = client.resource(url);
        
        Request request = new Request(1);
        String responseStr = webResource.path("postRequestJSONResponseString").type(MediaType.APPLICATION_JSON).post(String.class, request);
        System.out.println("Response:" + responseStr);
        
        request = new Request(2);
        Response response = webResource.path("postRequestJSONResponseXML").type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_XML).post(Response.class, request);
        System.out.println("Response id: " + response.getResponseId());
        
    }
   
}
