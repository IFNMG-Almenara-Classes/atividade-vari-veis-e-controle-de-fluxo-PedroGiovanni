package Atividade13;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double valor1, valor2;
        while (true){
            System.out.println("1- somar\n2- subtrair\n3- multiplicar\n4- dividir\n5- sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro valor: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    valor2 = sc.nextDouble();
                    System.out.println("Resultado: " + valor1 + " + " + valor2 + " = " + (valor1 + valor2));
                    break;
                case 2:
                    System.out.println("Digite o primeiro valor: ");
                    valor1 = sc.nextInt();
                    System.out.println("Digite o segundo valor: ");
                    valor2 = sc.nextInt();
                    System.out.println("Resultado: " + valor1 + " - " + valor2 + " = " + (valor1 - valor2));
                    break;
                case 3:
                    System.out.print("Digite o primeiro valor: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    valor2 = sc.nextDouble();
                    System.out.println("Resultado: " + valor1 + " x " + valor2 + " = " + (valor1 * valor2));
                    break;
                case 4:
                    System.out.print("Digite o primeiro valor: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    valor2 = sc.nextDouble();
                    System.out.println("Resultado: " + valor1 + " / " + valor2 + " = " + (valor1 / valor2));
                    break;
            }
            if (opcao == 5) {
                break;
            }
        }
    }
}
