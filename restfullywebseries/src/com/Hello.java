package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/webservices123")
public class Hello 
{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String welcomePlain()
	{
		return "Plain Type Ouput";
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String welcomeHtml()
	{
		return "<html>"+"<title>Welcome</title>"+"<body>"+"<h1>Html Type OutPut</h1>"+"</body>"+"</html>";
	}
	@GET
	@Produces(MediaType.TEXT_XML)
	public String welcomeXml()
	{
		return "<?xml version=\"1.0\"?>" + "<hellO> Xml Type OutPut" + "</hello>";
	}

}
