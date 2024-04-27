import java.util.Map;

public class BuscarMoneda {

    public String buscarNombreMoneda(NombreMoneda responde, String buscada){

        Map<String, String> listado = responde.supported_codes();

        return listado.get(buscada);
    }



}
