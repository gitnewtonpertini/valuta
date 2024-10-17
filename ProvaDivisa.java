public class ProvaDivisa {

	public static void main (String args[]) {
			Divisa d1 = new Divisa("EUR", 1.1149f);
			Divisa d2 = new Divisa("USD", 1f);
			Divisa d3 = new Divisa("GBP", 1.5502f);
			
			d1.visualizzaDivisa();
			d3.visualizzaDivisa();
			
			Valuta v1 = new Valuta(100f, d1);
			v1.visualizzaValuta();
			// converto in sterline (GBP)
			v1.converti("GBP");
			v1.visualizzaValuta();
			// ri-converto in euro
			v1.converti("EUR");
			v1.visualizzaValuta();
	}
}
