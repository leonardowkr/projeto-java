import java.util.Scanner;
public class restauranteDesc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int  idade = teclado.nextInt();
        if (idade>=10 && idade<=20) {
            System.out.println("10%");
        }
        else if (idade>=21 && idade<=30) {
            System.out.println("5%");
        }
        else if(idade>90){
            System.out.println("EVEN");
        }
        teclado.close();
    }
}
