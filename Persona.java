//Source file: C:\\Users\\Nacho\\Desktop\\UML programacion\\Cliente.java


public class Persona
{
   private String nombrePersona;
   private String dniPersona;
   
   /**
   @param String nombre
   @param String DNI
   @roseuid 58F86C50028F
    */
   public Persona(String nombre, String dni) 
   {
       nombrePersona = nombre;
       dniPersona = dni;
   }
   
   public String toString()
   {
       String nombreYDni = "";
       nombreYDni += "Nombre: " + nombrePersona + "\n" + "DNI: " + dniPersona;
       return nombreYDni;
   }
}
