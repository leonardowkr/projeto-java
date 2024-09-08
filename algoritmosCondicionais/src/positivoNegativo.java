import java.util.Scanner;
public class positivoNegativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num;
        num = teclado.nextInt();
        if (num>0) {
            System.out.println("POS");
        }
        else if(num<0){
            System.out.println("NEG");
        }
        else{
            System.out.println("ZERO");
        }
        teclado.close();
    }
}
