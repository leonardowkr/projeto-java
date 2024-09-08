import java.util.Scanner;
public class aprovadoReprovado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double nota1=teclado.nextDouble();
        double nota2=teclado.nextDouble();
        double nota3=teclado.nextDouble();
        double nota4=teclado.nextDouble();
        double nota5=teclado.nextDouble();
        double media = (nota1+nota2+nota3+nota4+nota5)/5;
        if(media>=6){
            System.out.println("APPROVED");
            System.out.printf("%.2f\n",media);
        }
        else{
            System.out.println("RETAKE");
            System.out.printf("%.2f\n",media);
        }
        teclado.close();
    }
}
