package desafioConversorTemperatura;
import java.util.Scanner;
public class conversorTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Insira a temperatura em Farenheit");
        double farenheit = teclado.nextDouble();
        double celsius = (farenheit - 32)/1.8;
        System.out.printf("A temperatura em celsius é: %.1f °C",celsius);
        teclado.close();
    }
}
