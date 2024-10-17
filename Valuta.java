public class Valuta {
	
	private float importo;
	
	private Divisa divisa;

	// Questo array contiene le diverse divise (i cui tassi di cambio
	// sono espressi rispetto al dollaro (tassoUSD)
	private Divisa cambi[] = {
		new Divisa("GBP", 1.5502f),
		new Divisa("JPY", 0.0083f),
		new Divisa("CNY", 0.1611f),
		new Divisa("VUV", 0.0094f),
		new Divisa("EUR", 1.1149f),
		new Divisa("MVR", 0.0649f)
	};

	public Valuta(float importo, Divisa divisa) {
		this.importo = importo;
		// Creo una copia dell'oggetto divisa senza assegnare per riferimento (this.divisa = divisa)
		this.divisa = new Divisa(divisa);
	}

	// TODO: completare
	public Valuta(float importo, Divisa divisa, Divisa cambi[]) {
		// Da completare
	}

	// TODO: Aggiunge una nuova divisa: codice, tasso di cambio rispetto
	// alla divisa di riferimento.
	public void aggiungiDivisa(Divisa divisa, String divisaRiferimento) {
		
	}
	
	public void visualizzaValuta() {
		divisa.visualizzaDivisa();
		System.out.println("importo: " + importo);
		System.out.println("----------------------------");
	}

	// Restituisce l'elemento (oggetto della classe Divisa) dell'array "cambi[]"
	// corrispondente al codice (es. "EUR") passato come parametro
	public Divisa getDivisa(String codice) {

		Divisa obj = null;
		for (int i = 0; i < cambi.length; i++)
			if ( cambi[i].getCodice().equals(codice) )
				// Creo una copia dell'oggetto divisa senza assegnare per riferimento
				obj = new Divisa(cambi[i]);
		return obj;
	}
	/*
	 * Da: http://it.wikipedia.org/wiki/Tasso_di_cambio Tasso di cambio incrociato (o cross rate)
	 * È possibile calcolare il tasso di cambio tra due monete (A e B) anche in modo indiretto.
	 * Quando si ha a disposizione il tasso di cambio di entrambe le monete rispetto ad una terza moneta (D)
	 * è possibile individuare il tasso di cambio tra le due monete calcolando il rapporto tra i
	 * rispettivi tassi di cambio delle due monete con la terza. In formula. tassoAB = tassoAD / tassoBD
	 * Questo metodo converte l'importo dell'oggetto, nel valore espresso nella divisa passata
	 * come parametro.
	 */
	
	public void converti(String codice) {
		Divisa nuovaDivisa = getDivisa(codice);
		importo = importo * (divisa.getTassoUSD() / nuovaDivisa.getTassoUSD());
		divisa = nuovaDivisa;
	}
	
}
