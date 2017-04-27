//Source file: C:\\Users\\Nacho\\Desktop\\UML programacion\\Barco.java


public class Barco 
{
   private String matricula;
   private Cliente dueño;
   private float eslora;
   private int anno;
   
   /**
   @param matricula
   @param eslora
   @param año
   @param dueño
   @roseuid 58F86D99032C
    */
   public Barco(String matricula, float eslora, int anno, Cliente dueño) 
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
   
   public float getEslora() 
   {
       return eslora;
   }
}
