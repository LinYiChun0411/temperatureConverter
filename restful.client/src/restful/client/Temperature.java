package restful.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class Temperature {
	WebTarget targetWebservice;
	WebTarget webPath;
	public Temperature() {
		URI uri=UriBuilder.fromUri("http://140.118.110.221:8080/restful.prj").build();
		ClientConfig config=new ClientConfig();
		Client client=ClientBuilder.newClient(config);
		targetWebservice=client.target(uri);
		webPath=targetWebservice.path("rest").path("temperatureConversion");		
	}

	double convert(String originUnit_To_targetUnit, Double oriTemVal) {
		Double targetVal = 0.0;
		switch (originUnit_To_targetUnit) {
		case "CtoR":
			targetVal = webPath.path("CtoR").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		case "CtoF":
			targetVal = webPath.path("CtoF").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		case "CtoK":
			targetVal = webPath.path("CtoK").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		
		case "RtoC":
			targetVal = webPath.path("RtoC").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		case "RtoF":
			targetVal = webPath.path("RtoF").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		case "RtoK":
			targetVal = webPath.path("RtoK").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		case "FtoC":
			targetVal = webPath.path("FtoC").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		case "FtoR":
			targetVal = webPath.path("FtoR").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		case "FtoK":
			targetVal = webPath.path("FtoK").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		case "KtoC":
			targetVal = webPath.path("KtoC").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		case "KtoR":
			targetVal = webPath.path("KtoR").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
		case "KtoF":
			targetVal = webPath.path("KtoF").path(oriTemVal.toString())
					.request().accept(MediaType.TEXT_PLAIN).get(Double.class);
			break;
	}
		return targetVal;
	}
	

}
