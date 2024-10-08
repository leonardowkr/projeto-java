package desafioFor;

public class desafioFor {
    public static void main(String[] args) {
        
        for(String valor="#";!valor.equals("#####");valor+="#"){
            System.out.println(valor);
        }
        for(int i=1;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
    }

}
