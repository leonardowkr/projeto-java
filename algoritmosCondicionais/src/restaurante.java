import java.util.Scanner;
public class restaurante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int  idade = teclado.nextInt();
        idade = idade % 2;
        if (idade<20) {
            System.out.println("TAG");
        }
        else if(idade==20){
            System.out.println("VIP");
        }
        else{
            System.out.println("ABEND");
        }
        teclado.close();
    }
}
