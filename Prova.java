import java.util.Scanner;

/**
 * Classe di test per l'applicazione Valuta
 * 
 * @author 4A ITI
 * @since ottobre 2024
 */
public class Prova {
    public static void main(String args[]) {
        float importo;

        // Test conversione
        System.out.println("\nTEST VALUTA/CONVERSIONE");
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci il valore da convertire: ");
        importo = sc.nextFloat();
        Valuta v1 = new Valuta("EUR", 1.023f);
        float v = v1.converti(importo);
        System.out.println("Il valore in dollari " + v);

        // Test del metodo polimorfico: calcolaTassa
        System.out.println("\nTEST TASSA/POLIMORFISMO");
        ValutaTaxAmeriche vta = new ValutaTaxAmeriche("USD", 1.023f);
        System.out.println("Tassa di cambio per area Americhe: " +
                vta.calcolaTassa(1000f));

        ValutaTaxEuropa vte = new ValutaTaxEuropa("EUR", 1.023f);
        System.out.println("Tassa di cambio per area Europa: " +
                vte.calcolaTassa(1000f));

        ValutaTaxAsiaAfrica vtaa = new ValutaTaxAsiaAfrica("USD", 1.023f);
        System.out.println("Tassa di cambio per area Asia/Africa: " +
                vtaa.calcolaTassa(1000f));

        // Cambio
        System.out.println("\nTEST CAMBIO/ARRAY/RIFERIMENTI");
        Valuta arr[] = new Valuta[4];
        //Valuta v1 = new Valuta("EUR", 1.023f);
        Valuta v2 = new Valuta("IND", 2.2f);
        Valuta v3 = new Valuta("AUD", 0.8f);
        Valuta v4 = new Valuta("JPY", 1.4f);

        arr[0] = v1;
        arr[1] = v2;
        arr[2] = v3;
        arr[3] = v4;

        // Attenzione!! l'array delle valute, e le valute che esso contiene (i
        // riferimenti) vengono passati al costruttore per riferimento (indirizzi), 
        // quindi, ad esempio, una modifica fatta all'oggetto di tipo Valuta, v1 (primo elemento dell'array),
        // sarà "visibile" (vedi esempio sotto) anche dall'oggetto c1, di tipo Cambio),
        // essendo, l'array (arr), il medesimo.
        // La soluzione consiste nel fare le copie degli oggetti, anche dell'array; in
        // questo contesto, la creazione delle copie può essere fatta nel costruttore
        // della classe Cambio.
        Cambio c1 = new Cambio(arr, 4);

        // Esempio modifica "visibile":
        System.out.println(c1.toString()); // stato prima della modifica
        v1.setDivisa("XYZ"); // modifica di una valuta
        System.out.println(c1.toString()); // si osservi che la modifica fatta è "visibile" nell'oggetto c1

        System.out.println("\nTEST CAMBIO/CONVERSIONE");
        Importo imp = new Importo(v2, 5000); // importo di 5000 IND (v2)
        // Converto 5000 IND in JPY (v4)
        System.out.println("Importo di " + imp.getImporto() + " " + imp.getValuta().getDivisa() 
                + " = " + c1.cambiaValuta(imp, v4).getImporto() + " " + v4.getDivisa());

        System.out.println("\nTEST USO DELLE DATE");
        
        sc.close();
    }
}
