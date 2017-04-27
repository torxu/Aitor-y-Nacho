public class Velero extends Barco
{
    private int numMastiles;

    public Velero(String matricula, float eslora, int anno, Cliente dueño, int mastiles)
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
    
    public int getCoeficienteDeBernua()
    {
        return numMastiles;
    }
}
