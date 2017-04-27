public class Velero extends Barco
{
    private int numMastiles;

    public Velero(String matricula, double eslora, int anno, Persona dueño, int mastiles)
    {
        super(matricula, eslora, anno, dueño);
        numMastiles = mastiles;
    }

    public String toString()
    {
        String cadena = "";
        cadena += super.toString() + "\n" + "NºMastiles: " + numMastiles;
        return cadena;
    }
    
    public int getCoeficienteBernua()
    {
        return numMastiles;
    }
}
