package DesafioClasseData;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        System.out.printf("%s/%s/%s\n",d1.dia,d1.mes,d1.ano);
        d1.dia = 18;
        d1.mes = 12;
        d1.ano = 2002;
        Data d2 = new Data(d1.dia,d1.mes,d1.ano);
        System.out.printf("%s/%s/%s\n",d2.dia,d2.mes,d2.ano);
        String dataFormatada = d1.obterDataFormatada();
        System.out.println(dataFormatada);
    }
}
