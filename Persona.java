/**
 * Clase persona
 */
public class Persona
{
   private String nombrePersona;
   private String dniPersona;
   
   /**
    * Constructor de la clase persona
   @param String nombre
   @param String DNI
    */
   public Persona(String nombre, String dni) 
   {
       nombrePersona = nombre;
       dniPersona = dni;
   }
 
   /**
    * Metodo que devuelve una cadena String
    * @return String
    */
   public String toString()
   {
       String nombreYDni = "";
       nombreYDni += "Nombre: " + nombrePersona + "\n" + "DNI: " + dniPersona;
       return nombreYDni;
   }
}
