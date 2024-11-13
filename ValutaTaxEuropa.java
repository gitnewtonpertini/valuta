/**
 * Classe figlia della classe {@link Valuta} che effettua
 * l'override (polimorfismo) del metodo {@link Valuta#calcolaTassa}.
 */
public class ValutaTaxEuropa extends Valuta {

    public ValutaTaxEuropa(String divisa, float tasso) {
        super(divisa, tasso);
    }
   
    public float calcolaTassa(float importo) {
        return importo/1000;
    }
}
