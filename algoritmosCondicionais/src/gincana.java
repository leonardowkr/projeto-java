import java.util.Scanner;
public class gincana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int A, B, soma,produto;
        A=teclado.nextInt();
        B=teclado.nextInt();
        soma=A+B;
        produto=A*B;
        if (produto<75) {
            System.out.printf(""+A+" "+B+"\n");
            System.out.println(soma);
        }
        else{
            System.out.printf(""+A+" "+B+"\n");
            System.out.println(produto);
        }
        teclado.close();
    }
}
