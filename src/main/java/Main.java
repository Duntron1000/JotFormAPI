import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception{
        Gson gson = new Gson();

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.jotform.com/form/230924308204044/submissions?apikey=879053a00a72670e166719c9b566b3d5&orderby=id"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(getResponse.body());

    }
}
