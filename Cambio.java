/**
 * Questa classe fornisce alcuni metodi di servizio per effettuare il cambio
 * tra valute diverse
 * 
 * @author 4D ITI a.s. 2024-25 
 * @since ottobre 2024
 */
public class Cambio {
    int n_valute;
    private Valuta valute[];
    
    // public Cambio(Valuta valute[], int n) {
    //     this.n_valute = n;
    //     this.valute = new Valuta[n];
    //     for (int i = 0; i < this.n_valute; i++) {
    //         // Per ogni elemento dell'array delle valute passato come parametro
    //         // creo una copia e la aggiungo al nuovo array appena creato (this.valute = new Valuta[n])
    //         Valuta v = new Valuta(valute[i].getDivisa(), valute[i].getTasso());
    //         this.valute[i] = v;
    //     }
    //}

    /**
     * Costruttore che riceve come parametri un  array di valute del quale ne crea una copia
     * mediante il costruttore di copia
     * @param valute[] Array delle valute 
     * @param n Dimensione dell'array
     */
    public Cambio(Valuta valute[], int n) {
        this.n_valute = n;
        this.valute = new Valuta[n];
        for (int i = 0; i < this.n_valute; i++) {
            // Per ogni elemento dell'array delle valute passato come parametro
            // creo una copia mediante il costruttore di copia
            Valuta v = new Valuta(valute[i]);
            this.valute[i] = v;
        }        
    }

    /** 
    * Converte un importo nella valuta desiderata. Dati un importo, quindi, con la rispettive valuta (A),
    * ed una valuta (B), nella quale si desidera convertire l'importo dato, usando il tasso di cambio
    * (rispetto al dollaro, USD), viene calcolato il rapporto tra i due tassi di cambio:  
    * tassoAB = tassoAD / tassoBD; D è lo USD, che viene moltiplicato per l'importo da convertire.
    * @param ia Importo da convertire
    * @param vb Valuta nella quale si desidera convertire l'importo
    * @return Importo convertito (oggetto di classe {@link Importo})
    */
    public Importo cambiaValuta(Importo ia, Valuta vb) {
        float importo_convertito = (ia.valuta.getTasso() / vb.getTasso()) * ia.getImporto();
        return new Importo(vb, importo_convertito);
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < this.n_valute; i++)
            str += this.valute[i].getDivisa() + " - " + this.valute[i].getTasso() + " | ";
        return str;
    }
}
