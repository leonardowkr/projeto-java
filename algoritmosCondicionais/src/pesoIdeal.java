import java.util.Scanner;

public class pesoIdeal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double altura = teclado.nextDouble();
        String sexo = teclado.next();
        
        
        double pesoIdeal;
        if(sexo.equals("man")){
            pesoIdeal = (72.2*altura)-58;
            System.out.printf("%.2f\n",pesoIdeal);
        }
        if(sexo.equals("woman")){
            pesoIdeal = (62.1*altura)-44.7;
            System.out.printf("%.2f\n",pesoIdeal);
        }
        teclado.close();
    }
}
