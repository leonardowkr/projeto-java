package prova;
import java.util.Scanner;
public class finalSemestre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;
        if(media>=9.8){
            System.out.println("APPROVED, CONGRATULATIONS");
        }
        else{
            if(media>=8.1){
                System.out.println("APPROVED");
            }
            else{
                if(media>=7){
                    System.out.println("APPROVED, BUT YOU CAN DO BETTER");
                }
                else{
                    if(media>=6){
                        System.out.println("RETAKE");
                    }
                    else{
                        System.out.println("FAILED");
                    }
                }
            }
        }
        teclado.close();
    }
}
