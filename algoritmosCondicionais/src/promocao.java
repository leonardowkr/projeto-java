import java.util.Scanner;
public class promocao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int produto;
        produto = teclado.nextInt();
        if (produto>=20) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        teclado.close();
    }
}
