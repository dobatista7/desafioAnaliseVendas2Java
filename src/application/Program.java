package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre o caminho do arquivo: ");
        String path = sc.nextLine();  // Leitura do caminho do arquivo pelo usuário
        System.out.println();

        // Armazenar as instâncias de Sale, onde a chave é o nome do vendedor
        Map<String, Double> salesMap = new HashMap<>();


        }
    }
