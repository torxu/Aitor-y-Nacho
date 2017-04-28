/**
 * Clase Velero que cuelga de Barco
 */
public class Velero extends Barco
{
    private int numMastiles;

    /**
    * Constructor de la clase Velero
    * @roseuid 58F89A0E0271
    * @param matricula String
    * @param eslora double
    * @param anno int
    * @param dueño Persona
    * @param mastiles int
    */
    public Velero(String matricula, double eslora, int anno, Persona dueño, int mastiles)
    {
        super(matricula, eslora, anno, dueño);
        numMastiles = mastiles;
    }

    /**
     * Metodo que devuelve una cade String
     * @return String
     */
    public String toString()
    {
        String cadena = "";
        cadena += super.toString() + "\n" + "NºMastiles: " + numMastiles;
        return cadena;
    }
  
    /**
     * Metodo que devuelve el coeficiente de Bernua
     * @return int
     */
    public int getCoeficienteBernua()
    {
        return numMastiles;
    }
}
