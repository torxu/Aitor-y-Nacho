/**
 *  Clase Yate, que cuelga de EmbarcacionAMotor
 */
public class Yate extends EmbarcacionAMotor 
{
   private int numCamarotes;
   
   /**
    * Constructor de la clase Yate
    * @roseuid 58F89A0E0271
    * @param matricula String
    * @param eslora double
    * @param anno int
    * @param due�o Persona
    * @param potencia int
    * @param camarotes int
    */
   public Yate(String matricula, double eslora, int anno, Persona due�o, int potencia, int camarotes) 
   {
       super(matricula, eslora, anno, due�o, potencia);
       numCamarotes = camarotes;
   }
   
   /**
    * Metodo que calcula el coeficiente de Bernua
    * @return int
    */
   public int getCoeficienteBernua() 
   {
       return super.getCoeficienteBernua() + numCamarotes;
   }
   
   /**
    * Metodo toString que devuelve una cadena
    * @return String
    */
   public String toString() 
   {
       String cadena ="";
       cadena += super.toString() + "\n" + "N�Camarotes: " + numCamarotes;;
       return cadena;
   }
}
