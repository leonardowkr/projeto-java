import java.util.Scanner;
public class parImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int  num = teclado.nextInt();
        num = num % 2;
        if (num!=0) {
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }
        teclado.close();
    }
}
