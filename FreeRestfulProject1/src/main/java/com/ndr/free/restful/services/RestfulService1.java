package com.ndr.free.restful.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/restfulService1")
public class RestfulService1
{

    @Path("getResponseAsString")
    @GET
    public String getResponseAsString()
    {
        return "OK";
    }
   
}
