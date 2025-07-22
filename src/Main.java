import client.ViaCepClient;

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

        ViaCepClient ex1 = new ViaCepClient();
        System.out.println(ex1.buscar(leitura));

    }
}
