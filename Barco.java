/**
 * Clase padre, utilizada por las clases EmbarcacionAMotor y Velero
 */
public abstract class Barco 
{
   private String matricula;
   private Persona due�o;
   private double eslora;
   private int anno;
   
   /**
    * Constructor de la clase Barco
    * @param matricula String
    * @param eslora double
    * @param a�o int
    * @param due�o Persona
    * @roseuid 58F86D99032C
    */
   public Barco(String matricula, double eslora, int anno, Persona due�o) 
   {
       this.matricula = matricula;
       this.eslora = eslora;
       this.anno = anno;
       this.due�o = due�o;
   }

   /**
    * Metodo toString para devolver los datos de Barco
    * @return String
    */
   public String toString() 
   {
       String cadena = "";
       cadena += due�o + "\n" + "Matricula: " + matricula + "\n" + "Eslora: " + eslora + "\n" + "A�o: " + anno;
       return cadena;
   }

   /**
    * Devuelve el atributo matricula
    * @return String
    */
   public String getMatricula() 
   {
       return matricula;
   }

   /**
    * Devuelve el atributo eslora
    * @return double
    */
   public double getEslora() 
   {
       return eslora;
   }
     
   public abstract int getCoeficienteBernua();
}
