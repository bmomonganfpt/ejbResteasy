package vn.com.fpt.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/web")
public class BidService {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHello() {
		return "hello world!";
	}
}
