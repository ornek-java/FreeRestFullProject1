package com.ndr.free.restful.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ndr.free.restful.model.Request;
import com.ndr.free.restful.model.Response;

@Path("/restfulService3")
public class RestfulService3
{

    @Path("postRequestJSONResponseString")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String postRequestJSONResponseString(Request request)
    {
        //TODO
        return "OK";
    }

    @Path("postRequestJSONResponseXML")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_XML)
    public Response postRequestJSONResponseXML(Request request)
    {
        Response response = new Response();
        response.setResponseId(1);
        //TODO
        return response;
    }
}
