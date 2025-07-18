import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um CEP: ");
        var leitura = scanner.nextLine();

        var endereco = "https://viacep.com.br/ws/"+ leitura + "/json/";

                HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //usando o .send o programa espera a resposta antes de continuar, pode quebrar entao eh obrigatorio o uso do throws

        String json = response.body();
        System.out.println(json);
    }
}
