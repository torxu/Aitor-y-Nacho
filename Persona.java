
public class Persona
{
   private String nombrePersona;
   private String dniPersona;
   
   /**
   @param String nombre
   @param String DNI
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
