public class Velero extends Barco
{
    private int numMastiles;

    public Velero(String matricula, double eslora, int anno, Persona due�o, int mastiles)
    {
        super(matricula, eslora, anno, due�o);
        numMastiles = mastiles;
    }

    public String toString()
    {
        String cadena = "";
        cadena += super.toString() + "\n" + "N�Mastiles: " + numMastiles;
        return cadena;
    }
    
    public int getCoeficienteBernua()
    {
        return numMastiles;
    }
}
