//Source file: C:\\Users\\Nacho\\Desktop\\UML programacion\\Barco.java


public abstract class Barco 
{
   private String matricula;
   private Persona dueño;
   private double eslora;
   private int anno;
   
   /**
   @param matricula
   @param eslora
   @param año
   @param dueño
   @roseuid 58F86D99032C
    */
   public Barco(String matricula, double eslora, int anno, Persona dueño) 
   {
       this.matricula = matricula;
       this.eslora = eslora;
       this.anno = anno;
       this.dueño = dueño;
   }
   
   public String toString() 
   {
       String cadena = "";
       cadena += dueño + "\n" + "Matricula: " + matricula + "\n" + "Eslora: " + eslora + "\n" + "Año: " + anno;
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
