import java.util.Scanner;
public class advinhacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double soma, precoProduto=100;
        double  palp1 = teclado.nextDouble();
        double  palp2 = teclado.nextDouble();
        double  palp3 = teclado.nextDouble();
        soma=palp1+palp2+palp3;
        if (soma==precoProduto) {
            System.out.printf("%.2f",precoProduto);
        }
        else{
            System.out.printf("%.2f",palp1);
            System.out.printf("%.2f",palp2);
            System.out.printf("%.2f",palp3);
        }
        teclado.close();
    }
}
