
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    //Atributo para medir el nivel de alcohol en sangre.
    private int nivelAlcoholSangre;
    //Atributo para el limite de alcohol.
    private int limiteAlcohol;
    //nombre del bebedor
    private String nombreBebedor;

    public Bebedor()
    {
        this.nombreBebedor = nombreBebedor;
        nivelAlcoholSangre = 0;
        limiteAlcohol = 10;
    }

    public void beberCopa(Cubata nombreCopa)
    {
        if (nivelAlcoholSangre > limiteAlcohol)
        {
            System.out.println("NO PUEDES BEBER MAS");
        }
        else
        {
            int copa = nombreCopa.saberCantidad();
            nivelAlcoholSangre = nivelAlcoholSangre + copa;
        }
    }
    
   
}
