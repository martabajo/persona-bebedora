
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
    //pregunta con si o no
    private String preguntaBebedor;

    public Bebedor(String nombreBebedor ,String preguntaBebedor)
    {
        this.nombreBebedor = nombreBebedor;
        this.preguntaBebedor = preguntaBebedor;
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

    public int nivelAlcoholSangre()
    {
        return nivelAlcoholSangre;
    }

    public String preguntaBebedor ()
    {
        String preguntaBebedor = null;
        if (nivelAlcoholSangre <= limiteAlcohol)
        {
            int caracteres = preguntaBebedor.length();
            if (caracteres % 2== 0)
            {preguntaBebedor = "NO";}
            else
            {preguntaBebedor = "SI";}
        }
        return preguntaBebedor;
    }
}
