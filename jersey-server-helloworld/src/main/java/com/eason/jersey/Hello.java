package com.eason.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Eason Lin
 *
 */
@Path("/hello")
public class Hello {

	@GET
	public String SayHello() {
		return "Hello World!";
	}


}
