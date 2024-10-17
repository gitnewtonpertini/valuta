
public class Divisa {

	// Sarebbe corretto porre tale atrributo costante (final)
	private String codice;
	// Tasso di cambio rispetto al dollaro (vedi: https://it.finance.yahoo.com/valute/convertitore) 
	private float tassoUSD;
	
	public Divisa(String codice, float tassoUSD) {
		this.codice = codice;
		this.tassoUSD = tassoUSD;
	}

	// Costruttore di copia
	public Divisa(Divisa obj) {
		this.codice = obj.getCodice();
		this.tassoUSD = obj.getTassoUSD();
		// Oppure in modo equivalente il seguente (riga 22) che invoca il costruttore (referenziato
		// tramite "this"; riga 9) individuato tramite la sua firma, parametri: String codice, float tassoUSD.
		// Si ricorda che, da una classe figlia, il costruttore della classe madre (superclasse),
		// viene invocato tramite l'uso della parola "super" (e firma...).
		//this(obj.getCodice(), obj.getTassoUSD());
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	public void setTassoUSD(float tassoUSD) {
		this.tassoUSD = tassoUSD;
	}
	
	public String getCodice() {
		return codice;
	}

	public float getTassoUSD() {
		return tassoUSD;
	}
	
	public void visualizzaDivisa() {
		System.out.println(codice + " - " + tassoUSD);
	}
	/*
	 * Da: https://it.wikipedia.org/wiki/Tasso_di_cambio#Tasso_di_cambio_incrociato_(o_cross_rate) Tasso di cambio incrociato (o cross rate)
	 * È possibile calcolare il tasso di cambio tra due monete (A e B) anche in modo indiretto.
	 * Quando si ha a disposizione il tasso di cambio di entrambe le monete rispetto ad una terza moneta (D)
	 * è possibile individuare il tasso di cambio tra le due monete calcolando il rapporto tra i
	 * rispettivi tassi di cambio delle due monete con la terza. In formula. tassoAB = tassoAD / tassoBD
	 * Questo metodo converte il valore, passato come primo parametro, nel valore espresso nella divisa passata
	 * come secondo parametro.
	 */
	// Questo metodo non viene utilizzato.
	public float convertiImporto(float importo, Divisa objDivisa) {
		return importo * (objDivisa.tassoUSD / tassoUSD);
	} 

}
