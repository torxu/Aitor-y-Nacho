public class Velero extends Barco
{
    private int numMastiles;

    public Velero(String matricula, float eslora, int anno, Cliente due�o, int mastiles)
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
    
    public int getCoeficienteDeBernua()
    {
        return numMastiles;
    }
}
