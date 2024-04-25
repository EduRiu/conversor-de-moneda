import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ListaDeMonedas {


    public Map<String, String> disponibles() {

        Map<String, String> nombreYMoneda = new HashMap<>();

        nombreYMoneda.put("Argentina", "ARS");
        nombreYMoneda.put("Brasil", "BRL");
        nombreYMoneda.put("Bolivia", "BOB");
        nombreYMoneda.put("Chile", "CLP");
        nombreYMoneda.put("Colombia", "COP");
        nombreYMoneda.put("Paraguay", "PYG");
        nombreYMoneda.put("Uruguay", "UYU");
        nombreYMoneda.put("Peru", "PEN");
        nombreYMoneda.put("Ecuador", "USD");
        nombreYMoneda.put("Euro", "EUR");
        nombreYMoneda.put("Estados Unidos", "USD");
        nombreYMoneda.put("Japon", "JPY");
        nombreYMoneda.put("China", "CNY");
        nombreYMoneda.put("Mexico", "MXN");
        nombreYMoneda.put("Canada", "CAD");

        return nombreYMoneda;
    }




    public void listar(){

        Map<String, String> nombreYMoneda = disponibles();

        System.out.println("opciones de cambio");
        for (Map.Entry<String, String> entry : nombreYMoneda.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public String nombreYmonedas(String nombre) {

        Map<String, String> nombreYMoneda = disponibles();

        if (nombreYMoneda.containsKey(nombre)) {
            return nombreYMoneda.get(nombre);
        } else {
            System.out.println("no se encontro el pais");
            return null;
        }
    }



}


