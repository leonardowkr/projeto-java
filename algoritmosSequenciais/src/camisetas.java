import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class camisetas {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        int P,M,G;
        double custo;
        P=teclado.nextInt();
        M=teclado.nextInt();
        G=teclado.nextInt();
        custo=(P*10)+(M*12)+(G*15);
        System.out.printf("%.0f",custo);
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        teclado.close();
 
    }
 
}