import java.util.Scanner;

public class eleicao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleitor;
        eleitor = teclado.nextInt();
        if (eleitor < 16) {
            System.out.println("Nao eleitor");
        } else {
            if (eleitor >= 16 && eleitor < 18) {
                System.out.println("Eleitor facultativo");
            } else {
                if (eleitor >= 18 && eleitor <= 64) {
                    System.out.println("Eleitor obrigatorio");
                } else {
                    System.out.println("Eleitor facultativo");
                }
            }
        }
        teclado.close();
    }
}
