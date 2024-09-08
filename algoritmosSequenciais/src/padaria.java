import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class padaria {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        int P,B;
        double pValor,bValor,poupanca,faturamento;
        P=teclado.nextInt();
        B=teclado.nextInt();
        pValor=P*0.12;
        bValor=B*1.5;
        faturamento=bValor+pValor;
        poupanca=0.1*faturamento;
        System.out.printf("%.2f\n",faturamento);
        System.out.printf("%.2f\n",poupanca);
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        teclado.close();
 
    }
 
}