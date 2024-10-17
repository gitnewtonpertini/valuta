public class ValutaTaxAsiaAfrica extends Valuta {

    public ValutaTaxAsiaAfrica(String divisa, float tasso) {
        super(divisa, tasso);
    }

    public float calcolaTassa(float importo) {
        float tasso = super.converti(importo) / 800 - 20; 
        return tasso > 0 ? tasso : 0;
    }
}
