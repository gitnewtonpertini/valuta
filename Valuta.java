import java.time.LocalDate;
/**
 * Questa classe rappresenta una valuta monetaria vedi:
 * <a href="../valuta.pdf">valuta.pdf</a>
 * 
 * @author 4A ITI a.s. 2024-25
 * @version %I%, %G%
 */
public class Valuta {
  public String divisa;
  public float tasso;
  private LocalDate dataTasso;

  public Valuta(String divisa, float tasso) {
    this.divisa = divisa;
    this.tasso = tasso;
    // Siccome il metodo now della classe LocalDate è statico
    // non serve creare una istanza (oggetto) della classe per 
    // utilizzarlo (https://docs.oracle.com/javase/10/docs/api/java/time/LocalDate.html)
    this.dataTasso = LocalDate.now();
  }



  /**
   * Costruttore di copia
   * @param valuta Oggetto di classe Valuta da copiare
   */
  public Valuta(Valuta valuta) {
    this.divisa = valuta.getDivisa();
    this.tasso = valuta.tasso;
  }

  public void setDivisa(String d) {
    this.divisa = d;
  }

  public void setTasso(float t) {
    this.tasso = t;
  }

  public String getDivisa() {
    return divisa;
  }

  /**
   * Metodo per la conversione del importo in USD utilizzando il tasso di cambio
   * predefinito
   * 
   * @param importo
   * @return Importo convertito nella valuta corrente dell'oggetto.
   */
  public float converti(float importo) {
    return importo * this.tasso;
  }

  public float calcolaTassa(float importo) {
    return (float) 0.0;
  }

  public float getTasso() {
    return this.tasso;
  }

}
