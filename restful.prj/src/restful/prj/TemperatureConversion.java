package restful.prj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/temperatureConversion")
public class TemperatureConversion {

	// Celsius to Farenheit
	@GET
	@Path("/CtoF/{CelciusDegree}")
	@Produces(MediaType.TEXT_PLAIN)
	public double CelciusToFarenheit(
			@PathParam("CelciusDegree") double CelciusDegree) {

		return CelciusDegree * (9.0 / 5.0) + 32;
	}

	// Celsius to Kelvin
	@GET
	@Path("CtoK/{CelciusDegree}")
	@Produces(MediaType.TEXT_PLAIN)
	public double CelciusToKelvin(
			@PathParam("CelciusDegree") double CelciusDegree) {
		return CelciusDegree + 273.15;
	}

	// Celsius to Reaumur
	@GET
	@Path("CtoR/{CelciusDegree}")
	@Produces(MediaType.TEXT_PLAIN)
	public double CelciusToReaumur(
			@PathParam("CelciusDegree") double CelciusDegree) {

		return CelciusDegree * (4.0 / 5.0);
	}

	// Reaumur to Celsius
	@GET
	@Path("RtoC/{Reaumur}")
	@Produces(MediaType.TEXT_PLAIN)
	public double ReaumurToCelsius(@PathParam("Reaumur") double Reaumur) {

		return Reaumur + 5.0 / 4.0;
	}

	// Reaumur to Fahrenheit
	@GET
	@Path("RtoF/{Reaumur}")
	@Produces(MediaType.TEXT_PLAIN)
	public double ReaumurToFahrenheit(@PathParam("Reaumur") double Reaumur) {
		return (Reaumur * 9.0 / 4.0) + 32;
	}

	// Reaumur to Kelvin
	@GET
	@Path("RtoK/{Reaumur}")
	@Produces(MediaType.TEXT_PLAIN)
	public double ReaumurToKelvin(@PathParam("Reaumur") double Reaumur) {
		return (Reaumur * 5.0 / 4.0) + 273.15;
	}

	// Farenheit to Celcius
	@GET
	@Path("FtoC/{Farenheit}")
	@Produces(MediaType.TEXT_PLAIN)
	public double FarenheitToCelcius(@PathParam("Farenheit") double Farenheit) {

		return (Farenheit - 32) * (5.0 / 9.0);
	}

	// Farenheit to Réaumur
	@GET
	@Path("FtoR/{Farenheit}")
	@Produces(MediaType.TEXT_PLAIN)
	public double FarenheitToReaumur(@PathParam("Farenheit") double Farenheit) {

		return (Farenheit - 32) * (4.0 / 9.0);
	}

	// Farenheit to Kelvin
	@GET
	@Path("FtoK/{Farenheit}")
	@Produces(MediaType.TEXT_PLAIN)
	public double FarenheitToKelvin(@PathParam("Farenheit") double Farenheit) {

		return (Farenheit + 459.67) * (5.0 / 9.0);
	}
	
	// Kelvin to Celsius
		@GET
		@Path("KtoC/{Kelvin}")
		@Produces(MediaType.TEXT_PLAIN)
		public double KelvinToCelsius(@PathParam("Kelvin") double Kelvin) {

			return Kelvin-273.15;
		}

	// Kelvin to Fahrenheit
	@GET
	@Path("KtoF/{Kelvin}")
	@Produces(MediaType.TEXT_PLAIN)
	public double KelvinToFahrenheit(@PathParam("Kelvin") double Kelvin) {

		return (Kelvin * 9.0/5.0)-459.67;
	}
	
	// Kelvin to Réaumur
	@GET
	@Path("KtoR/{Kelvin}")
	@Produces(MediaType.TEXT_PLAIN)
	public double KelvinToReaumur(@PathParam("Kelvin") double Kelvin) {
		
		return (Kelvin-273.15)*(4.0/5.0);
		
	}
	
	

}
