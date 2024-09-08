import java.util.Scanner;
public class sorteio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int  num1 = teclado.nextInt();
        int  num2 = teclado.nextInt();
        int  num3 = teclado.nextInt();
        num1 = num1 % 2;
        num2 = num2 % 2;
        num3 = num3 % 2;
        String ParImpar1 = num1 == 0 ? "1" : "2";
        String ParImpar2= num2 == 0 ? "1" : "2";
        String ParImpar3 = num3 == 0 ? "1" : "2";
        
        if(ParImpar1=="1"){
            if(ParImpar2=="1"){
                System.out.println("1");
            }
            else if(ParImpar3=="1"){
                System.out.println("1");
            }
            else{
                System.out.println("2");
            }
        }

        else if(ParImpar2=="1"){
            if(ParImpar3=="1"){
                System.out.println("1");
            }
            else{
                System.out.println("2");
            }
        }
        else{
            System.out.println("2");
        }
        teclado.close();
    }
}
// 2 1 2