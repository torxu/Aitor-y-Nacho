/**
 * Class called Rent that it's main function is to give us the prize of a Ship Rent
 * @author Nacho
 */
public class Alquiler
{
    
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
    
    private static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    private static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    /**
     * Constructor for class Alquiler that initialises the atributtes
     * @param numDias whole number that saves how much amount will the ship be in the amarre
     * @param barco Barco that saves the info of the ship
     * @param posicionAmarre whole number that saves the position in the amarre
     */
    public Alquiler(int numDias, Barco barco, int posicionAmarre)
    {
        diasOcupacion = numDias;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    /**
     * Method toString that returns the info of the rent
     * @return String chain of characters
     */
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += diasOcupacion + "\n";
        textoADevolver += posicionAmarre + "\n";
        textoADevolver += barco.toString();
        return textoADevolver;
    }
    
    /**
     * Method that returns the prize of the rent
     * @return double the amount of money to pay
     */
    public double getPrecioAlquiler()
    {
        double precio = 0;
        double eslora = (double)barco.getEslora();
        precio = (diasOcupacion * (eslora * VALOR_MULTIPLICADOR_ESLORA)) + (VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernua());
        return precio;
    }
    
}
