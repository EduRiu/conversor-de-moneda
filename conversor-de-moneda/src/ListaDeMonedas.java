import java.util.HashMap;
import java.util.Map;

public class ListaDeMonedas {

    public String nombreYmonedas(String nombre) {

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
        nombreYMoneda.put("Euro", "USD");
        nombreYMoneda.put("Estados Unidos", "USD");
        nombreYMoneda.put("Japon", "JPY");
        nombreYMoneda.put("China", "CNY");
        nombreYMoneda.put("Mexico", "MXN");
        nombreYMoneda.put("Canada", "CAD");

        if (nombreYMoneda.containsKey(nombre)) {
            return nombreYMoneda.get(nombre);
        } else {
            System.out.println("no se encontro el pais");
            return null;
        }
    }
}


