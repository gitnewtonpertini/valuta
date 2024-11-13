/**
 * Classe figlia della classe {@link Valuta} che effettua
 * l'override (polimorfismo) del metodo {@link Valuta#calcolaTassa}.
 */
public class ValutaTaxAmeriche extends Valuta {
    public ValutaTaxAmeriche(String divisa, float tasso) {
        super(divisa, tasso);
    }

    public float calcolaTassa(float importo) {
        return importo / 900 + 10;
    }
}
