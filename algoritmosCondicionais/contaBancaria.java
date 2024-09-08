import java.util.Scanner;
public class contaBancaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double  num1 = teclado.nextDouble();
        double  num2 = teclado.nextDouble();
        double num3 = teclado.nextDouble();
        int negativo=0;
        if (num1<0) {
            negativo++;
        }
        if (num2<0) {
            negativo++;
        }
        if (num3<0) {
            negativo++;
        }
        System.out.println(negativo);
        teclado.close();
    }
}
