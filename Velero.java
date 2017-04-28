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
    * @param due�o Persona
    * @param mastiles int
    */
    public Velero(String matricula, double eslora, int anno, Persona due�o, int mastiles)
    {
        super(matricula, eslora, anno, due�o);
        numMastiles = mastiles;
    }

    /**
     * Metodo que devuelve una cade String
     * @return String
     */
    public String toString()
    {
        String cadena = "";
        cadena += super.toString() + "\n" + "N�Mastiles: " + numMastiles;
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
