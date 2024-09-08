import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class doadorSangueII {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        int idade;
        double peso;
        idade=teclado.nextInt();
        peso=teclado.nextDouble();
        if((idade>=16 && idade<70) && (peso>=50))
        {
            System.out.printf("YES\n");
        }
        else{
            System.out.printf("NO\n");
        }
        teclado.close();
    }
 
}