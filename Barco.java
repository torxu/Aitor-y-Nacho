//Source file: C:\\Users\\Nacho\\Desktop\\UML programacion\\Barco.java


public abstract class Barco 
{
   private String matricula;
   private Persona due�o;
   private double eslora;
   private int anno;
   
   /**
   @param matricula
   @param eslora
   @param a�o
   @param due�o
   @roseuid 58F86D99032C
    */
   public Barco(String matricula, double eslora, int anno, Persona due�o) 
   {
       this.matricula = matricula;
       this.eslora = eslora;
       this.anno = anno;
       this.due�o = due�o;
   }
   
   public String toString() 
   {
       String cadena = "";
       cadena += due�o + "\n" + "Matricula: " + matricula + "\n" + "Eslora: " + eslora + "\n" + "A�o: " + anno;
       return cadena;
   }
   
   public String getMatricula() 
   {
       return matricula;
   }
   
   public double getEslora() 
   {
       return eslora;
   }
   
   public abstract int getCoeficienteBernua();
}
