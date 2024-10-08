package desafioConversao;
import java.util.Scanner;

public class desafioConversao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String primSalarioTexto;
        String segSalarioTexto;
        String tercSalarioTexto;
        System.out.println("Digite o primeiro salário");
        primSalarioTexto = teclado.next().replace(",", ".");
        System.out.println("Digite o segundo salário");
        segSalarioTexto = teclado.next().replace(",", ".");
        System.out.println("Digite o terceiro salário");
        tercSalarioTexto = teclado.next().replace(",", ".");
        double primSalario = Double.parseDouble(primSalarioTexto);
        double segSalario = Double.parseDouble(segSalarioTexto);
        double tercSalario = Double.parseDouble(tercSalarioTexto);
        double media = (primSalario + segSalario + tercSalario) / 3;
        System.out.println("A media salarial é R$ "+media);
        teclado.close();
    }
}
