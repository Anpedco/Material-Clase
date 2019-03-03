import javax.json.*;

public class TestJSON2 {
    public static void main(String[] args) {


        JsonBuilderFactory factory = Json.createBuilderFactory(null);
        JsonObject raiz = factory.createObjectBuilder()
                .add("regulador", factory.createObjectBuilder()
                    .add("condensadores", factory.createArrayBuilder()
                        .add(factory.createObjectBuilder()
                            .add("ID", "C1")
                            .add("tipo", "ceramico")
                            .add("fabricante", "Murata")
                            .add("valor", factory.createObjectBuilder()
                                .add("magnitud", 0.47)
                                .add("unidades", "uF")
                                )
                            .add("voltaje", factory.createObjectBuilder()
                                .add("magnitud", 50)
                                .add("unidades", "V")
                                )
                            .add("encapsulado", "0805")
                            .add("disipador", false)
                            )
                        .add(factory.createObjectBuilder()
                            .add("ID", "C2")
                            .add("tipo", "electrolítico")
                            .add("fabricante", "Murata")
                            .add("valor", factory.createObjectBuilder()
                                .add("magnitud", 0.1)
                                .add("unidades", "uF")
                                )
                            .add("voltaje", factory.createObjectBuilder()
                                .add("magnitud", 12)
                                .add("unidades", "V")
                                )
                            .add("encapsulado", JsonValue.NULL)
                            .add("disipador", false)
                            )
                        )
                    .add("circuitos integrados", factory.createArrayBuilder()
                        .add(factory.createObjectBuilder()
                            .add("ID", "IC1")
                            .add("tipo", "LM7805")
                            .add("fabricante", "Fairchild Semiconductor")
                            .add("encapsulado", "T0220")
                            .add("disipador", true)
                        ) 
                    )
                ).build();
                    
                  

        System.out.println("Objeto JSON regulador:\n" + raiz + "\n");

        JsonObject reguladorObject = raiz.getJsonObject("regulador");


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