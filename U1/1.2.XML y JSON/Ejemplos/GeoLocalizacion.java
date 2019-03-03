import java.io.StringReader;
import javax.json.*;
import java.net.URLEncoder;
import java.net.URL;
import java.util.Scanner;

class GeoLocalizacion {

	public static void geocoding(String addr) throws Exception	{
        
        // build a URL
		String s = "https://maps.google.com/maps/api/geocode/json?" +
					"sensor=false&address="; 
		s += URLEncoder.encode(addr, "UTF-8");
		
		

		System.out.println("API REST: " + s);
		URL url = new URL(s);

		// read from the URL
		Scanner scan = new Scanner(url.openStream());
		String str = new String(); 
		while (scan.hasNext()) {
			str += scan.nextLine();
		}
		scan.close();
		System.out.println("Respuesta: " + str);
		// build a JSON object
		JsonReader lector = Json.createReader(new StringReader(str));
		JsonObject obj = lector.readObject();


		//JsonObject obj = new JsonObject(str);

		if (! obj.getString("status").equals("OK"))
		return;

		// get the first result
		JsonObject res = obj.getJsonArray("results").getJsonObject(0); 
		System.out.println(res.getString("formatted_address")); 
		JsonObject loc = res.getJsonObject("geometry").getJsonObject("location"); 
		System.out.println("lat: " + loc.getJsonNumber("lat").doubleValue() +
		", lng: " + loc.getJsonNumber("lng").doubleValue());
		}

	public static void main (String args[]) throws Exception {
		geocoding("Camino de Vera, Valencia, Spain");
	} 
}