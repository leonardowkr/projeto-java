import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class quizCasal {
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        int N1P1 = teclado.nextInt();
        int N2P1 = teclado.nextInt();
        int N1P2 = teclado.nextInt();
        int N2P2 = teclado.nextInt();
        int somaP1= N1P1+N2P1;
        int somaP2 = N1P2+N2P2;
        if(somaP1!=somaP2){
            System.out.println(somaP1);
            System.out.println(somaP2);
        }
        else{
            System.out.printf("%d + %d = %d\n",N1P1,N2P1,somaP1);
            System.out.printf("%d + %d = %d\n",N1P2,N2P2,somaP2);
        }
        teclado.close();
    }
 
}