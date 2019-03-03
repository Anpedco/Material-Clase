import java.io.StringReader;
import javax.json.*;
import java.net.URLEncoder;
import java.net.URL;
import java.util.Scanner;

class Cambio {

	public static void main (String[] args) throws Exception	{
        
        // URL
		String s = "https://api.exchangeratesapi.io/latest"; 
		System.out.println("API REST: " + s);

		URL url = new URL(s);

		// lectura respuesta API REST
		Scanner scan = new Scanner(url.openStream());
		String str = new String(); 
		while (scan.hasNext()) {
			str += scan.nextLine();
		}
		scan.close();
		System.out.println("Respuesta: " + str);

		// JSON
		JsonReader lector = Json.createReader(new StringReader(str));
		JsonObject respuesta = lector.readObject();
		
		String base = respuesta.getString("base");
		String fecha = respuesta.getString("date");

		System.out.println("base: " + base+ ", fecha: "+fecha);

		
		JsonObject ratios = respuesta.getJsonObject("rates"); 

		// Ratio con dolar
		double dolar_ratio = ratios.getJsonNumber("USD").doubleValue();
		System.out.println("Ratio 1 euro: "+dolar_ratio + " dolares");


	} 
}