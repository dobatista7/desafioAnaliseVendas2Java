package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

        // Leitura do arquivo CSV
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();  // Ler a primeira linha (cabeçalho)

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");  // Supondo que o separador seja vírgula

                // Mapear os campos para os atributos da classe Sale
                String seller = fields[2];
                Double total = Double.parseDouble(fields[4]);

                // Acumula o total de vendas por vendedor
                salesMap.put(seller, salesMap.getOrDefault(seller, 0.0) + total);
            }

            System.out.println("Total de vendas por vendedor:");
            // Exibe o total de vendas por vendedor
            for (Map.Entry<String, Double> entry : salesMap.entrySet()) {
                System.out.println(entry.getKey() + " - R$ " + String.format("%.2f", entry.getValue()));
            }

        } catch (IOException e) {
            // Tratamento de exceção em caso de erro na leitura do arquivo
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
