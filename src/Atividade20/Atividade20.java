package Atividade20;
import java.util.Scanner;

public class Atividade20 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();

            if ((num % 3 == 0 && num % 5 != 0) || (num % 5 == 0 && num % 3 != 0)) {
                System.out.println("O número atende à condição.");
            } else {
                System.out.println("O número NÃO atende à condição.");
            }

            sc.close();
        }
    }

}
