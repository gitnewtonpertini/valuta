import java.util.Scanner;

public class Prova{
    public static void main(String args[]){
        float importo;

        // Test classe Valuta
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserisci il valore da convertire:");
        importo=sc.nextFloat();
        Valuta n1=new Valuta("EUR", 1.023f);
        float x= n1.converti(importo);
        System.out.println("Il valore in dollari "+x);

        // Test del metodo polimorfico: calcolaTassa
        ValutaTaxAmeriche vta = new ValutaTaxAmeriche("USD", 1.023f);
        System.out.println("Tassa di cambio per area Americhe: " + vta.calcolaTassa(1000f));

        ValutaTaxEuropa vte = new ValutaTaxEuropa("EUR", 1.023f);
        System.out.println("Tassa di cambio per area Europa: " + vte.calcolaTassa(1000f));

        ValutaTaxAsiaAfrica vtaa = new ValutaTaxAsiaAfrica("USD", 1.023f);
        System.out.println("Tassa di cambio per area Asia/Africa: " + vtaa.calcolaTassa(1000f));

      sc.close();
    }
}
