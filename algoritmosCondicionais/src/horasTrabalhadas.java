import java.util.Scanner;

public class horasTrabalhadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas, horaExtra, horaNormal = 40;
        double valorHora,salario;
        horas = teclado.nextInt();

        valorHora = teclado.nextDouble();
        if (horas > 40) {
            horaExtra = horas-horaNormal;
            salario = horaNormal * valorHora;
            salario = salario + (horaExtra * 2 * valorHora);
            
        } else {
            salario = horas * valorHora;
        }
        System.out.printf("%.2f",salario);
        teclado.close();
    }
}
