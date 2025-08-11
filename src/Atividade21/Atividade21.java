package Atividade21;
import java.util.Scanner;

public class Atividade21 {

    public class Aposentadoria {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            System.out.print("Digite o tempo de serviço (anos): ");
            int tempo = sc.nextInt();

            if (idade >= 65 || tempo >= 30 || (idade >= 60 && tempo >= 25)) {
                System.out.println("Pode se aposentar.");
            } else {
                System.out.println("Não pode se aposentar.");
            }

            sc.close();
        }
    }

}
