//javac ConversorDeMedidas.java
//java ConversorDeMedidas

import java.util.Scanner;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("==== Conversor de Unidades de Medida ====");
            System.out.println("1. Metros para Quilômetros");
            System.out.println("2. Quilômetros para Metros");
            System.out.println("3. Metros para Centímetros");
            System.out.println("4. Metros para Milímetros");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    metrosParaQuilometros(scanner);
                    break;
                case 2:
                    quilometrosParaMetros(scanner);
                    break;
                case 3:
                    metrosParaCentimetros(scanner);
                    break;
                case 4:
                    metrosParaMilimetros(scanner);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha !=5);

        scanner.close();

    }

    //Conversão de Metros para Quilômetos
    public static void metrosParaQuilometros(Scanner scanner) {
        System.out.print("Digite o valor em metros: ");
        double metros = scanner.nextDouble();
        double quilometros = metros / 1000;
        System.out.println(metros + " metros = " + quilometros + " quilômetros.");
    }


    // Conversão de Quilômetros para Metros
    public static void quilometrosParaMetros(Scanner scanner) {
        System.out.print("Digite o valor em quilômetros: ");
        double quilometros = scanner.nextDouble();
        double metros = quilometros * 1000;
        System.out.println(quilometros + " quilômetros = " + metros + " metros.");
    }

    // Conversão de Metros para Centímetros
    public static void metrosParaCentimetros(Scanner scanner) {
        System.out.print("Digite o valor em metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100;
        System.out.println(metros + " metros = " + centimetros + " centímetros.");
    }

    // Conversão de Metros para Milímetros
    public static void metrosParaMilimetros(Scanner scanner) {
        System.out.print("Digite o valor em metros: ");
        double metros = scanner.nextDouble();
        double milimetros = metros * 1000;
        System.out.println(metros + " metros = " + milimetros + " milímetros.");
    }
}
