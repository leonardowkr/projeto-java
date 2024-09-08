/*
 * Ronaldo foi desafiado pelo seu primo a jogar um jogo no qual ele sempre fui muito bom. O jogo consiste em dizer um valor inteiro N e, após isso, repeti-lo  N vezes.

Ajude Ronaldo a passar o desafio.

Entrada

Um número inteiro N onde 0<N<100.

Saída

A saída deve conter o número N escrito N vezes.
 */
import java.util.Scanner;
public class primos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num=teclado.nextInt();
        int x=num-1;
        for(int i=0;i<num;i++){
            System.out.print(num);
            if (x!=i) {
                System.out.print(" ");
            }
        }
        teclado.close();
    }
}
