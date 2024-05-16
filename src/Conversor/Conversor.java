package Conversor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;




public class Conversor {
    String moedaBase;
    String moedaFinal;
    Menu menu;


    Scanner sc = new Scanner(System.in);


    public void conv()throws IOException, InterruptedException{

        Menu m= new Menu();
        m.menu();

        int opcao = m.getOpcao();


        while (true)

        {
            if (opcao >= 7) break;

            m.menu();
            System.out.println("Informe o valor: ");
            double valor = sc.nextDouble();

            switch (opcao) {
                case 1: {
                    moedaBase = "USD";
                    moedaFinal = "ARS";

                }
                case 2: {
                    moedaBase = "ARS";
                    moedaFinal = "USD";
                }
                case 3: {
                    moedaBase = "BRL";
                    moedaFinal = "USD";
                }
                case 4: {
                    moedaBase = "USD";
                    moedaFinal = "BRL";
                }
                case 5: {
                    moedaBase = "USD";
                    moedaFinal = "COP";
                }
                case 6: {
                    moedaBase = "COP";
                    moedaFinal = "USD";
                }


                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/2105a105bdbd9a865b66ae14/pair/" + moedaBase + "/" + moedaFinal + "/" + valor))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                Gson gson = new GsonBuilder().setLenient().create();
                Conversor resultado = gson.fromJson(json, Conversor.class);
                System.out.println(resultado);

            }
        }

    }

}
