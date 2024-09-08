package prova;
import java.io.IOException;
import java.util.Scanner;
    public class gincanaTurmaB {
     
        public static void main(String[] args) throws IOException {
     
            Scanner teclado = new Scanner (System.in);
            int n1 = teclado.nextInt();
            int n2 = teclado.nextInt();
            int soma = n1+n2;
            int resultado;
            if(soma>20){
                resultado = soma + 8;
                System.out.println(resultado);
            }
            else{
                resultado = soma - 5;
                System.out.println(resultado);
            }
            teclado.close();
        }
     
    }

