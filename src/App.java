import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws Exception {

        String url = "https://api.mocki.io/v2/549a5d8b";
        URI endereco = URI.create(url);

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        String body = response.body();

        ObjectMapper mapper = new ObjectMapper();

        Resposta resposta = mapper.readValue(body, Resposta.class);

        for(Movie filme : resposta.getMovieList()) {
            System.out.println(filme.getTitle());
        }
    }
}
