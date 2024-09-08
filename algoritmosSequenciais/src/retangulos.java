import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class retangulos {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        double H,B,area, perimetro,diagonal;
        H=teclado.nextDouble();
        B=teclado.nextDouble();
        perimetro=2*H+2*B;
        area=H*B;
        diagonal=Math.sqrt(Math.pow(B,2)+Math.pow(H,2));
        System.out.printf("%.2f\n",perimetro);
        System.out.printf("%.2f\n",area);
        System.out.printf("%.2f\n",diagonal);
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        teclado.close();
 
    }
 
}