import java.util.Scanner;
public class prestacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double  salario = teclado.nextDouble();
        double  prestacao = teclado.nextDouble();
        double limite_prestacao=salario*0.3;
        if (limite_prestacao>prestacao) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }    
        teclado.close();
}
}