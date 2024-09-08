import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class piscina {
    public static void main(String[] args) throws IOException {
        double B, H, triangulo,losango;
        Scanner teclado = new Scanner (System.in);
        B=teclado.nextDouble();
        H=teclado.nextDouble();
        triangulo=(B*H)/2;
        losango=((H*2)*B)/2;
        System.out.printf("%.2f\n", triangulo);
        System.out.printf("%.2f\n", losango);
        teclado.close();
 
    }
 
}