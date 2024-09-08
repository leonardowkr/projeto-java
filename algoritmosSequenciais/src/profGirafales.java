import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class profGirafales {
 
    public static void main(String[] args) throws IOException {
        int P,A,p_sobre_a,prof;
        Scanner teclado = new Scanner (System.in);        
        P  = teclado.nextInt();
        A = teclado.nextInt();
        p_sobre_a=P/A;
        prof=P%A;
        System.out.printf("%d \n %d\n",p_sobre_a,prof);
        teclado.close();
    }
 
}