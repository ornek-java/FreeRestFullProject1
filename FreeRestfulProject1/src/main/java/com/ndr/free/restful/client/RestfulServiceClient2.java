package com.ndr.free.restful.client;

import com.ndr.free.restful.model.Response;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RestfulServiceClient2{
     

    public static void main(String[] args) {
    	String url = "http://localhost:8080/FreeRestfulProject1/services/restfulService2";
    	ClientConfig clientConfig = new DefaultClientConfig();
    	clientConfig.getFeatures().put(ClientConfig.FEATURE_DISABLE_XML_SECURITY, true);
        Client client = Client.create(clientConfig);
        WebResource webResource = client.resource(url);
        Response response = webResource.path("getResponseXML").get(Response.class);
        System.out.println("Response id:" + response.getResponseId());
    }

      
}
