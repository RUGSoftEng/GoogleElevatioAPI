/**
 * 
 */
package nl.rug.GoogleElevatioAPI;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * @author Georgios Digkas <digasgeo@gmail.com>
 *
 */
public class Main {

	/**
	 * SET Google Maps Elevation API key: https://developers.google.com/maps/documentation/elevation/intro
	 */
	private static final String KEY = "Google_Maps_Elevation_API_KEY_HERE";

	/**
	 * @param args
	 * @throws UnirestException 
	 */
	public static void main(String[] args) throws UnirestException {
		HttpResponse<String> response = getElevationByLatLng(53.2404711, 6.5341254);
		Results results = responseToObject(response);

		System.out.println(results.getResults().get(0).toString());
		System.out.println("The elevation is: " + results.getResults().get(0).getElevation());
	}

	/**
	 * 
	 * @param response Google Maps Elevation API response
	 * @return {@link Results} Object
	 */
	private static Results responseToObject(HttpResponse<String> response) {
		Gson gson = new Gson();
		return gson.fromJson(response.getBody(), Results.class);
	}

	/**
	 * 
	 * @param lat - the latitude
	 * @param lng - the longitude
	 * @return Google Maps Elevation API response
	 * @throws UnirestException
	 */
	private static HttpResponse<String> getElevationByLatLng(double lat, double lng) throws UnirestException {
		HttpResponse<String> response = Unirest.get("https://maps.googleapis.com/maps/api/elevation/json?locations=" + lat + "%2C" + lng + "&key=" + KEY).asString();
		return response;
	}

}
