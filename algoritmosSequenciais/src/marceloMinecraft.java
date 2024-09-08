import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class marceloMinecraft {
    public static void main(String[] args) throws IOException {
        int x1,x2,y1,y2;
        double d;
        Scanner teclado = new Scanner (System.in);
        x1=teclado.nextInt();
        y1=teclado.nextInt();
        x2=teclado.nextInt();
        y2=teclado.nextInt();
        d=Math.sqrt((Math.pow((x2-x1), 2))-(Math.pow((y2-y1), 2)));
        System.out.printf("%.2f\n", d);
        teclado.close();
 
    }
 
}