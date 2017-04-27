public class EmbarcacionAMotor extends Barco 
{
   private int potencia;
   
   /**
   @param matricula
   @param eslora
   @param a�o
   @param potencia
   @param due�o
   @roseuid 58F8705E0230
    */
   public EmbarcacionAMotor(String matricula, double eslora, int anno, Persona due�o, int potencia) 
   {
       super(matricula, eslora, anno, due�o);
       this.potencia = potencia;
   }
   
   public String toString() 
   {
       String cadena = "";
       cadena += super.toString() + "\n" + "CV: " + potencia;
       return cadena;
   }
   
   public int getCoeficienteBernua()
   {
       return potencia;
   }
   public int getCoeficienteDeBernua()
   {
       return 0;
   }
}
