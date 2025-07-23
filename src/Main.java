import client.ViaCepClient;
import model.Endereco;
import model.GerarArquivo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ViaCepClient ex1 = new ViaCepClient();

        System.out.println("Digite um CEP: ");
        var leitura = scanner.nextLine();


        try {
            Endereco endereco = ex1.buscar(leitura);
            System.out.println(endereco);
            GerarArquivo gerarArquivo = new GerarArquivo();
            gerarArquivo.salvarJson(endereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando o programa.");
        }
    }
}
