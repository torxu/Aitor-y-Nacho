//Source file: C:\\Users\\Nacho\\Desktop\\UML programacion\\Yate.java


public class Yate extends EmbarcacionAMotor 
{
   private int numCamarotes;
   
   /**
   @roseuid 58F89A0E0271
    */
   public Yate(String matricula, double eslora, int anno, Persona due�o, int potencia, int camarotes) 
   {
       super(matricula, eslora, anno, due�o, potencia);
       numCamarotes = camarotes;
   }
   

   public int getCoeficienteBernua() 
   {
       return super.getCoeficienteBernua() + numCamarotes;
   }

   public String toString() 
   {
       String cadena ="";
       cadena += super.toString() + "\n" + "N�Camarotes: " + numCamarotes;;
       return cadena;
   }
}
