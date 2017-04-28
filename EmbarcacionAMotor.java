/**
 * Clase EmbarcacionAMotor, que cuelga de Barco
 */
public class EmbarcacionAMotor extends Barco 
{
   private int potencia;
   
   /**
    * Constructor de la clase EmbarcacionAMotor
    * @param matricula
    * @param eslora
    * @param a�o
    * @param potencia
    * @param due�o
    * @roseuid 58F8705E0230
    */
   public EmbarcacionAMotor(String matricula, double eslora, int anno, Persona due�o, int potencia) 
   {
       super(matricula, eslora, anno, due�o);
       this.potencia = potencia;
   }
   
   /**
    * Metodo toString que devuelve una cadena
    * @return String
    */
   public String toString() 
   {
       String cadena = "";
       cadena += super.toString() + "\n" + "CV: " + potencia;
       return cadena;
   }

   /**
    * Metodo que devuelve el coeficiente de Bernua
    * @return int
    */
   public int getCoeficienteBernua()
   {
       return potencia;
   }
   
   public int getCoeficienteDeBernua()
   {
       return 0;
   }
}
