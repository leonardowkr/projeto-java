package src;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class desafioConversao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String primSalario;
        String segSalario;
        String tercSalario;
        primSalario = JOptionPane.showInputDialog("Digite o primeiro salário");
        segSalario = JOptionPane.showInputDialog("Digite o segundoe salário");
        tercSalario = JOptionPane.showInputDialog("Digite o terceiro salário");
        teclado.close();
    }
}
