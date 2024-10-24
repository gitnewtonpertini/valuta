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
