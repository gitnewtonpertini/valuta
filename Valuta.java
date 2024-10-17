public class Valuta {
    public String divisa;
    public float tasso;
  
   public Valuta(String divisa, float tasso){
    this.divisa=divisa;
    this.tasso=tasso;
   }

   public void setDivisa(String d){
     this.divisa=d;
   }
   public void setTasso(float t){
    this.tasso=t;
   }
   
   public String getDivisa(){
    return divisa;
   }

   //metodo per la conversione del importo in USD utilizzando il tasso di cambio predefinito
   public float converti (float importo){
        return importo*this.tasso;
    }
    
    public float calcolaTassa(float importo) {
      return (float) 0.0;
    }

}
    

