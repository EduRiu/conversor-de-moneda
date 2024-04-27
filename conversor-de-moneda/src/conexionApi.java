import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class conexionApi {

    public modeloMoneda cotizar(String monedaInicial, String monedaDestino, int cantidad) {

        String API = "c3a1ea0f643cce461e34158d";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + API + "/pair/" + monedaInicial + "/" + monedaDestino + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (RuntimeException e) {
            System.out.println("no corre");
        } catch (Exception e) {
            throw new RuntimeException("Operacion no valida");
        }
        return new Gson().fromJson(response.body(), modeloMoneda.class);

    }

    public NombreMoneda lista () {

        String API = "c3a1ea0f643cce461e34158d";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + API + "/codes/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (RuntimeException e) {
            System.out.println("no corre");
        } catch (Exception e) {
            throw new RuntimeException("Operacion no valida");
        }
        return new Gson().fromJson(response.body(), NombreMoneda.class);
    }
}
