/**
 * Class Port that is going to be used to interact with all other classes 
 * Is going to be the class to rent different Port or to finish the rents of the different Ship
 * @author Nacho
 */

public class Puerto
{
   
    private Alquiler[] amarres;
    /**
     * Constructor for class Puerto that initialises an Array of Alquiler
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }
    
    /**
     * Method used to rent amarres 
     * @param numDias whole number used to calculate the total rent
     * @param barco of class Barco that is use to enter a ship in the rent
     * @return double that is the total price of the rent 
     */
    public double alquilarAmarre(int numDias, Barco barco)
    {
        double precio = -1;
        if (hayAmarresLibres()){
            int posicionAmarreAAlquilar = posicionPrimerAmarreLibre();
            amarres[posicionAmarreAAlquilar] = new Alquiler(numDias, barco, posicionPrimerAmarreLibre());
            precio = amarres[posicionAmarreAAlquilar].getPrecioAlquiler();
        }
        return precio;
    }
    
    /**
     * Method that is used to finish a rent
     * @param posicionAmarre whole number used to look up the possition of the ship rented
     * @return a double number that is going to be the prize of the rent or -1 if that amarre is not full
     */
    public double liquidarAlquilerAmarre(int posicionAmarre)
    {
        double precio = -1;
        if (posicionAmarre >= 0 && posicionAmarre < amarres.length && amarres[posicionAmarre] != null){
            precio = amarres[posicionAmarre].getPrecioAlquiler();
            amarres[posicionAmarre] = null;
        }
        return precio;
    }
    
    /**
     * Method that shows up how is the state of the port
     */
    public void verEstadoAmarres()
    {
        for (int i = 0; i < amarres.length; i++){
            if (amarres[i] != null){
                System.out.println(amarres[i].toString());
            }
        }
    }
    
    /**
     * Method that returns the first possition of a free amarre if not returns -1
     * @return the possition of the first possiton of a free amarre
     */
    public int posicionPrimerAmarreLibre()
    {
        int primerAmarrelibre = -1;
        if (hayAmarresLibres()){
            int i = 0;
            while (i < amarres.length && primerAmarrelibre == -1){
                if (amarres[i] == null){
                    primerAmarrelibre = i;
                }
                i++;
            }
        }
        return primerAmarrelibre;
    }
    
    /**
     * Method that returns yes or not if there are free amarres
     * @return a yes if are amarres or not if there aren't
     */
    public boolean hayAmarresLibres()
    {
        boolean amarresLibres = false;
        int i = 0;
        while (i < amarres.length && amarresLibres == false){
            if (amarres[i] == null){
                amarresLibres = true;
            }
            i++;
        }
        return amarresLibres;
    }
}
    