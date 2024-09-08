import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class aluguel {
 
    public static void main(String[] args) throws IOException {
        double X, Y,aluguel;
        int Z;
        Scanner teclado = new Scanner (System.in);        
        X = teclado.nextDouble();
        Y = teclado.nextDouble();
        Z = teclado.nextInt();
        aluguel = X+(X*(Y/100)*Z);
        System.out.printf("Valor do aluguel: $%.2f\n",aluguel);
        teclado.close();
 
    }
 
}