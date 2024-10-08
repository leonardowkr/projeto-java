package DesafioClasseData;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada(){
        String data;
        String diaData = Integer.toString(dia);
        String mesData = Integer.toString(mes);
        String anoData = Integer.toString(ano);
        data = diaData+"/"+mesData+"/"+anoData;

        // ou podemos utilizar a um atributo da classe String : 
        // String.format("%d/%d/%d",dia,mes,ano);
        return data;
    }
    Data(int diaInicial, int mesInicial, int anoInicial){
        dia=diaInicial;
        mes=mesInicial;
        ano=anoInicial;
    }
    Data(){
        dia=01;
        mes=01;
        ano=1970;
    }
    
}
