package prova;

import java.util.Scanner;

public class dvdsAluguel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cor = teclado.nextLine();
        double custoDvd = 0;
        int qtd = teclado.nextInt();
        double valor;
        switch (cor) {
            case "Blue":
            custoDvd = 10;
                break;
            case "Pink":
            custoDvd = 25;
                break;
            case "Green":
            custoDvd = 35;
                break;
            case "Red":
            custoDvd = 50;
                break;
        }
        valor = qtd * custoDvd;
        System.out.println(qtd);
        System.out.printf("%.2f\n",custoDvd);
        System.out.printf("%.2f\n",valor);
        teclado.close();
    }
}
