package calculadora;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite dois números");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        System.out.println("Digite a operação");
        String operacao = teclado.next();
        double resultado = (operacao.equals("+")) ? num1+num2 : 0;
        resultado = (operacao.equals("-")) ? num1-num2 : resultado; 
        resultado = (operacao.equals("*")) ? num1*num2 : resultado; 
        resultado = (operacao.equals("/")) ? num1/num2 : resultado; 
        resultado = (operacao.equals("%")) ? num1%num2 : resultado;   
        System.out.println(num1+" "+operacao+" "+ num2+" = "+resultado);
        teclado.close();
    }
}
