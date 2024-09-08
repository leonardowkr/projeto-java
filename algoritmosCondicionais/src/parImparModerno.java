import java.util.Scanner;
public class parImparModerno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int  num1 = teclado.nextInt();
        int  num2 = teclado.nextInt();
        int soma = num1 + num2;
        soma = soma % 2;
        if (soma!=0) {
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }
        teclado.close();
    }
}
