package com.ndr.free.restful.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ndr.free.restful.model.Request;
import com.ndr.free.restful.model.Response;

@Path("/restfulService2")
public class RestfulService2
{

    @Path("getResponseXML")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response getResponseXML()
    {
        Response response = new Response();
        response.setResponseId(1);
        //TODO
        return response;
    }
   
}
