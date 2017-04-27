public class EmbarcacionAMotor extends Barco 
{
   private int potencia;
   
   /**
   @param matricula
   @param eslora
   @param año
   @param potencia
   @param dueño
   @roseuid 58F8705E0230
    */
   public EmbarcacionAMotor(String matricula, double eslora, int anno, Persona dueño, int potencia) 
   {
       super(matricula, eslora, anno, dueño);
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
