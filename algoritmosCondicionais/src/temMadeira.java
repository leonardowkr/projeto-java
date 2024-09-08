import java.util.Scanner;

public class temMadeira {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double packs = teclado.nextDouble();
        if (packs > 30) {
            System.out.println(">30");
        } else {
            if (packs < 30) {
                System.out.println("<30");
            } else {
                System.out.println("=30");
            }

            teclado.close();
        }
    }
}
