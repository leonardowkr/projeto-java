package prova;

import java.util.Scanner;

public class intervalorProibido {
    public static void main(String[] args) {
        int x;
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
        if(x==0){
            System.out.println("prohibited interval");
        }
        else{
            if(x>-100 && x<100){
            double resultado = (5*x + 3)/(Math.sqrt(Math.pow(x,2)-16));
            System.out.printf("%.3f\n",resultado);
            }
        }
        teclado.close();

    }
}
