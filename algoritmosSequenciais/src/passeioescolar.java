import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class passeioescolar {
    public static void main(String[] args) throws IOException {
        double apts=42,diaria,faturamento,faturamentopromo,diariadesconto,perda;
        Scanner teclado = new Scanner (System.in);
        diaria=teclado.nextDouble();
        diariadesconto=diaria*(1-0.22);
        faturamento=apts*0.40*diaria*30;
        faturamentopromo=apts*0.7*diariadesconto*30;
        perda=faturamentopromo-faturamento;
        System.out.printf("R$ %.2f\n", diariadesconto);
        System.out.printf("R$ %.2f\n", faturamento);
        System.out.printf("R$ %.2f\n", faturamentopromo);
        System.out.printf("R$ %.2f\n", perda);
        teclado.close();
 
    }
 
}