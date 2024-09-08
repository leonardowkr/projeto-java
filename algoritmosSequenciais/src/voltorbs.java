import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class voltorbs {
 
    public static void main(String[] args) throws IOException {
 
        double raio, area;
        Scanner teclado = new Scanner(System.in);
        raio=teclado.nextDouble();
        area = 3.1415926*(raio*raio);
        System.out.printf("Area: %.2f\n",area);
        teclado.close();
    }
 
}