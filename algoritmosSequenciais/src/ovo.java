import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ovo {
 
    public static void main(String[] args) throws IOException {
        double ovo, ovoDescontado;
        Scanner teclado = new Scanner (System.in);        
        ovo = teclado.nextDouble();
        ovoDescontado=ovo*0.91;
        System.out.printf("R$ %.2f\n",ovoDescontado);
        teclado.close();
 
    }
 
}