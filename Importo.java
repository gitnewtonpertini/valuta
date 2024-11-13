/**
 * Questa classe rappresenta un importo monetario espresso nella
 * relativa vauta e riferito ad una determinata data-ora-zona (stato):
 * <a href="../valuta.pdf">valuta.pdf</a>
 * 
 * @author 4A ITI a.s. 2024-25
 * @since ottobre 2024
 */
public class Importo  {
    float importo;
    Valuta valuta;

    public Importo(Valuta valuta, float importo) {
        this.importo = importo;
        this.valuta = valuta;
    }
    public float getImporto() {
        return importo;
    }
    public void setImporto(float importo) {
        this.importo = importo;
    }
    public Valuta getValuta() {
        return valuta;
    }
    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }
    
}
