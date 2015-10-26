package restful.client;

import java.net.URI;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.client.ClientConfig;

public class RestfulClient {
	
	public static void main(String[] args) {
		ClientConfig config=new ClientConfig();
		Client client=ClientBuilder.newClient(config);
		WebTarget targetWebservice=client.target(getBaseUri());
		WebTarget webPath=targetWebservice.path("rest").path("temperatureConversion");		
		
		System.out.println("input the temperature degree and temperature unit(ex 100 celcius):");
		
		Scanner myScanner=new Scanner(System.in);		
		Double degree=myScanner.nextDouble();
		String unit=myScanner.next();
		myScanner.close();
		
		switch(unit){
		case "celcius":
			Double CelciusToReaumur = webPath.path("CtoR")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

			System.out.println("Celcius-To-Reaumur:" + CelciusToReaumur);

			Double CelciusToFarenheit = webPath.path("CtoF")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

			System.out.println("Celcius-To-Farenheit:" + CelciusToFarenheit);

			Double CelciusToKelvin = webPath.path("CtoK")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

			System.out.println("Celcius-To-Kelvin:" + CelciusToKelvin);
			break;
		case "reaumur":
			Double ReaumurToCelcius = webPath.path("RtoC")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

				System.out.println("Reaumur-To-Celcius:" + ReaumurToCelcius);

			Double ReaumurToFarenheit = webPath.path("RtoF")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

			System.out.println("Reaumur-To-Farenheit:" + ReaumurToFarenheit);

			Double ReaumurToKelvin = webPath.path("RtoK")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

			System.out.println("Reaumur-To-Kelvin:" + ReaumurToKelvin);
			break;
		case "farenheit":
			Double FarenheitToCelcius = webPath.path("FtoC")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

				System.out.println("Farenheit-To-Celcius:" + FarenheitToCelcius);

			Double FarenheitToReaumur = webPath.path("RtoR")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

			System.out.println("Farenheit-To-Reaumur:" + FarenheitToReaumur);

			Double FarenheitToKelvin = webPath.path("FtoK")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

			System.out.println("Farenheit-To-Kelvin:" + FarenheitToKelvin);
			break;
		case "kelvin":
			Double KelvinToCelcius = webPath.path("KtoC")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

				System.out.println("Kelvin-To-Celcius:" + KelvinToCelcius);

			Double KelvinToFarenheit = webPath.path("KtoF")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

			System.out.println("Kelvin-To-Farenheit:" + KelvinToFarenheit);

			Double KelvinToReaumur = webPath.path("KtoR")
					.path(degree.toString()).request()
					.accept(MediaType.TEXT_PLAIN).get(Double.class);

			System.out.println("Kelvin-To-Reaumur:" + KelvinToReaumur);
			break;
		
		}										   
	
		
	}
	private static URI getBaseUri(){
		
		return UriBuilder.fromUri("http://140.118.110.221:8080/restful.prj").build();
	}

}
