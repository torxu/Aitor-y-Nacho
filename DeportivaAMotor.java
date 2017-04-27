public class DeportivaAMotor extends Barco 
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
   public DeportivaAMotor(String matricula, float eslora, int anno, Cliente due�o, int potencia) 
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
