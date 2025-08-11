package Atividade3;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("par");
        }
        else{
            System.out.println("ímpar");
        }
    }
}
