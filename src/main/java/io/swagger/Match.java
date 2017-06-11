package io.swagger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by RafaelLopez on 6/11/17.
 */
@Path("matches")
public class Match {

	@GET
	@Path("all")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMatches() {
		return "{\n" +
				"\t\"match\": {\n" +
				"\t\t\"home\": \"Atlético Nacional\",\n" +
				"\t\t\"away\": \"Deportivo Cali\"\n" +
				"\t},\n" +
				"\t\"date\": \"11-06-2017\"\n" +
				"}";
	}
}
