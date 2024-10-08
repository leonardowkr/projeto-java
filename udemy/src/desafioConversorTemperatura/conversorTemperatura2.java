package desafioConversorTemperatura;
import java.util.Scanner;
public class conversorTemperatura2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Insira a temperatura em Farenheit");
        double celsius = teclado.nextDouble();
        double farenheit = (1.8*celsius + 32);
        System.out.printf("A temperatura em Farenheit é: %.1f °F",farenheit);
        teclado.close();
    }
}
