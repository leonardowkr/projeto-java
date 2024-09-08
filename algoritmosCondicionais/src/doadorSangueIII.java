import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class doadorSangueIII {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        int idade;
        double peso;
        String jejum,documento,hepatite,malaria;
        idade=teclado.nextInt();
        peso=teclado.nextDouble();
        teclado.nextLine();
        jejum=teclado.nextLine();
        documento=teclado.nextLine();
        hepatite=teclado.nextLine();
        malaria=teclado.nextLine();
        if(idade>=16 && idade<70)
        {
                if(peso>=50)
                {
                    if(jejum.equals("YES"))
                    {
                        if(documento.equals("YES"))
                        {
                            if(hepatite.equals("NO"))
                            {
                                if(malaria.equals("NO"))
                                {
                                    System.out.printf("YES\n");
                                }
                                else{
                                    System.out.println("NO");
                                }
                            }
                            else{
                                System.out.println("NO");
                            }
                        }
                        else{
                            System.out.println("NO");
                        }
                    }
                    else{
                        System.out.printf("NO\n");
                    }
                }
                else{
                    System.out.printf("NO\n");
                }    
        }
        else{
            System.out.printf("NO\n");
        }
        teclado.close();
    }
 
}