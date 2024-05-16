package Conversor;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.net.httpserver.Request;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Conversor conversor = new Conversor();
        conversor.conv();





    }
}