public class ValutaTaxEuropa extends Valuta {

    public ValutaTaxEuropa(String divisa, float tasso) {
        super(divisa, tasso);
    }
   
    public float calcolaTassa(float importo) {
        return importo/1000;
    }
}
