package Atividade2;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float peso;
        float altura;


        System.out.println("Digite seu peso: ");
        peso = sc.nextFloat();
        System.out.println("Digite sua altura: ");
        altura = sc.nextFloat();

        double IMC = (peso/(altura*altura));

        if(IMC<18.5){
            System.out.println("Magreza");
        }
        else if(IMC<24.9){
            System.out.println("Saudavel");
        }
        else if(IMC<29.9){
            System.out.println("Sobrepeso");
        }
        else if(IMC<34.9){
            System.out.println("Obesidade grau 1");
        }
        else if(IMC<39.9){
            System.out.println("Obesidade grau 2(Severa)");
        }
        else{
            System.out.println("Obesidade grau 3(Mórbida)");
        }
        System.out.println(IMC);
    }
}
