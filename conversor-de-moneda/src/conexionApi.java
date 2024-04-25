import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class conexionApi {

    public modeloMoneda cotizar (String monedaInicial, String monedaDestino, Double cantidad) {

        String API = "c3a1ea0f643cce461e34158d";
        URI direccion =
                URI.create("https://v6.exchangerate-api.com/v6/" + API + "/par/" + monedaInicial + "/" + monedaDestino + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), modeloMoneda.class);
        } catch (Exception e) {
            throw new RuntimeException("Operacion no valida");
        }

    }
}
