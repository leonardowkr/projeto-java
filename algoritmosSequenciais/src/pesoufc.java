import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class pesoufc {
 
    public static void main(String[] args) throws IOException {
        double pesoFinal,pesodoze,P,N,pesog;
        Scanner teclado = new Scanner (System.in);
        P=teclado.nextDouble();
        N=teclado.nextDouble();
        pesog=P*1000;
        pesodoze=P+P*0.12;
        pesoFinal=pesodoze+pesodoze*(N/100);
        System.out.printf("Gramas = %.0fg\n", pesog);
        System.out.printf("Peso depois dos 12%% = %.2fkg\n",pesodoze);
        System.out.printf("Peso final = %.2fkg\n",pesoFinal);
        teclado.close();
 
    }
 
}