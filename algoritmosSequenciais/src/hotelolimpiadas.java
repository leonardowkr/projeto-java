import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class hotelolimpiadas {
    public static void main(String[] args) throws IOException {
        double apts,diaria,faturamento,faturamentoparcial,diariadesconto,perda;
        Scanner teclado = new Scanner (System.in);
        apts=teclado.nextDouble();
        diaria=teclado.nextDouble();
        diariadesconto=diaria*0.75;
        faturamento=apts*diariadesconto;
        faturamentoparcial=apts*diariadesconto*0.7;
        perda=apts*diaria*0.25;
        System.out.printf("R$ %.2f\n", diariadesconto);
        System.out.printf("R$ %.2f\n", faturamento);
        System.out.printf("R$ %.2f\n",faturamentoparcial);
        System.out.printf("R$ %.2f\n",perda);
        teclado.close();
 
    }
 
}