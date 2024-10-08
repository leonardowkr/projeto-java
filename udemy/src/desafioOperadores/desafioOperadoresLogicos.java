package desafioOperadores;
public class desafioOperadoresLogicos {
    public static void main(String[] args) {
        boolean trabalho1=true;
        boolean trabalho2=true;
        boolean comprouTelevisao50Pol = (trabalho1 && trabalho2);
        boolean comprouTelevisao38Pol = (trabalho1 ^ trabalho2);
        boolean passeioNoShopping = (trabalho1 || trabalho2);
        boolean ficarEmCasa = !(trabalho1 || trabalho2);
        boolean ficarSaudavel = !(passeioNoShopping);
        System.out.printf("comprouTelevisao50Pol: " + comprouTelevisao50Pol +"\n");
        System.out.printf("comprouTelevisao38Pol: " + comprouTelevisao38Pol+"\n");
        System.out.printf("passeioNoShopping: "+ passeioNoShopping+"\n");
        System.out.printf("ficarEmCasa: "+ficarEmCasa+"\n");
        System.out.println("ficar saudavel: "+ficarSaudavel+"\n");
    }
}
