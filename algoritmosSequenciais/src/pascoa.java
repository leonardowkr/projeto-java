import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class pascoa {
    public static void main(String[] args) throws IOException {
        double R, area, perimetro;
        Scanner teclado = new Scanner (System.in);
        R=teclado.nextDouble();
        area=3.14*Math.pow(R,2);
        perimetro=2*3.14*R;
        System.out.printf("%.2f\n", perimetro);
        System.out.printf("%.2f\n", area);
        teclado.close();
 
    }
 
}