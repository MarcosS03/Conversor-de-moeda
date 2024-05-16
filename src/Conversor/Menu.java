package Conversor;

import java.util.Scanner;

public class Menu {
    int opcao;

    public int menu() {
        System.out.println("Escolha uma das opções logo abaixo");
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Dólar =>> Peso agentino");
        System.out.println("2 - Peso agentino =>> Dólar");
        System.out.println("3 - Real brasileiro =>> Dólar");
        System.out.println("4 - Dólar =>> Real brasileiro");
        System.out.println("5 - Dólar =>> Peso colombiano");
        System.out.println("6 - Peso colombiano =>> Dólar");
        System.out.println("7 - Sair");
        return opcao = sc.nextInt();
    }

    public int getOpcao() {
        return opcao;
    }
}
