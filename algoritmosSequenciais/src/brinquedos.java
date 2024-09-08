import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class brinquedos {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        double P,desconto,Pfinal;
        P=teclado.nextDouble();
        desconto=P*0.09;
        Pfinal=P-desconto;
        System.out.printf("Valor original do produto: R$%.2f\n",P);
        System.out.printf("Valor final do produto: R$%.2f\n",Pfinal);
        System.out.printf("Valor final do desconto: R$%.2f\n",desconto);
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        teclado.close();
 
    }
 
}