import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
    //    System.out.println("Hello World!");

        String url = "https://api.mocki.io/v2/549a5d8b";
        URI endereco = URI.create(url);

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        String body = response.body();

        JSONParser parser = new JSONParser();

        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        for(Map<String, String> filme : listaDeFilmes) {
            System.out.println(filme.get("fullTitle"));
        }
    }
}
