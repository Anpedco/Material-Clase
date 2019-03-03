import java.io.StringReader;
import javax.json.*;

public class TestJSON {
    public static void main(String[] args) {

        String raizStr = 
            "{ \"regulador\": " + 
                "{" +
                "\"condensadores\" : [" +  
                  "{" +
                    "\"ID\":\"C1\"," +  
                    "\"tipo\":\"ceramico\"," +
                    "\"fabricante\":\"Murata\"," + 
                    "\"valor\":{\"magnitud\":0.47, \"unidades\":\"uF\"}," + 
                    "\"voltaje\":{\"magnitud\":50, \"unidades\":\"V\"}," +
                    "\"encapsulado\":\"0805\","+
                    "\"disipador\":false" +
                  "}," + 
                  "{" +
                    "\"ID\":\"C2\"," +  
                    "\"tipo\":\"electrolitico\"," +
                    "\"fabricante\":\"Murata\"," +
                    "\"valor\":{\"magnitud\":0.1, \"unidades\":\"uF\"}," +
                    "\"voltaje\":{\"magnitud\":12, \"unidades\":\"V\"}," +
                    "\"encapsulado\":null," +
                    "\"disipador\":false" +
                  "}" +
                "]," +
                "\"circuitos integrados\" : [" +
                  "{" +
                    "\"ID\":\"IC1\"," +
                    "\"tipo\":\"LM7805\"," +
                    "\"fabricante\":\"Fairchild Semiconductor\"," +
                    "\"encapsulado\":\"T0220\"," +
                    "\"disipador\":true" +
                  "}" + 
                "]" + 
              "}" +   
            "}" ;


        System.out.println("String raiz:\n" + raizStr + "\n");

        JsonReader lector = Json.createReader(new StringReader(raizStr));

        
        JsonObject raiz = lector.readObject();


        System.out.println("Objeto JSON raiz:\n" + raiz + "\n");

        JsonObject reguladorObject = raiz.getJsonObject("regulador");

        lector.close();

        JsonArray condensadores = reguladorObject.getJsonArray("condensadores");

        for (JsonValue condensador : condensadores) {
            JsonObject capacitor = (JsonObject) condensador;

            String ID = capacitor.getString("ID");
            
            String tipo = capacitor.getString("tipo");
            
            String fabricante = capacitor.getString("fabricante");
            
            JsonObject valor = capacitor.getJsonObject("valor");
            double capacidad = valor.getJsonNumber("magnitud").doubleValue();
            String unidades_capacidad = valor.getString("unidades");
            
            JsonObject voltaje = capacitor.getJsonObject("voltaje");
            double tension = voltaje.getJsonNumber("magnitud").doubleValue(); 
            String unidades_tension = voltaje.getString("unidades");

            // En todas aquellas propiedades cuyo valor posible sea null, 
            // debe emplearse esta sobrecarga para evitar Excepcion
            String encapsulado = capacitor.getString("encapsulado", null);

            boolean disipador = capacitor.getBoolean("disipador");

            System.out.println("ID: " + ID);
            System.out.println("tipo: " + tipo);
            System.out.println("fabricante: " + fabricante);
            System.out.println("valor: " + capacidad + unidades_capacidad);
            System.out.println("voltaje: " + tension + unidades_tension);
            System.out.println("encapsulado: " + encapsulado);
            System.out.println("disipador: " + disipador);
            System.out.println("\n");
        }

        JsonArray CIs = reguladorObject.getJsonArray("circuitos integrados");
        for (JsonValue CI : CIs) {
            JsonObject ci = (JsonObject) CI;
            String ID = ci.getString("ID");
            String tipo = ci.getString("tipo");
            String fabricante = ci.getString("fabricante");
            String encapsulado = ci.getString("encapsulado");
            boolean disipador = ci.getBoolean("disipador");
            
            System.out.println("ID: " + ID);
            System.out.println("tipo: " + tipo);
            System.out.println("fabricante: " + fabricante);
            System.out.println("encapsulado: " + encapsulado);
            System.out.println("disipador: " + disipador);
            System.out.println("\n");
        }


    } // main

}  // Class