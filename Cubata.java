
/**
 * Write a description of class Cubata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
    //tipo de bebeida
    private String nombreCopa;
    //cantidad de alcohol
    private int cantidadAlcohol;
 
   public Cubata(String nombreCopa , int cantidadAlcohol)
   {
       this.nombreCopa = nombreCopa;
       this.cantidadAlcohol = cantidadAlcohol;
   }
   
   /**
    * Devuelve la cantidad de alcohol.
    */
   public int saberCantidad()
   {
    return cantidadAlcohol;
   }
   /**
    * Devuelve el nombre del cubata.
    */
   public String nombreCopa()
   {
    return nombreCopa;
    }
}
