
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    //Atributo para medir el nivel de alcohol en sangre.
    private float nivelAlcoholSangre;
    //Atributo para el limite de alcohol.
    private float limiteAlcohol;
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

    public float nivelAlcoholSangre()
    {
        return nivelAlcoholSangre;
    }

    public void beberCopa(Cubata nombreCopa)
    {
        if (nivelAlcoholSangre > limiteAlcohol)
        {
            System.out.println("NO PUEDES BEBER MAS");
        }
        else
        {
            float copa = nombreCopa.saberCantidad();
            nivelAlcoholSangre = nivelAlcoholSangre + copa;
        }
    }

    public void preguntaBebedor (String preguntaBebedor)
    {
        int numeroDeLetrasDeLaPregunta = preguntaBebedor.length();
        if ((nivelAlcoholSangre >= limiteAlcohol) || (preguntaBebedor.contains(nombreBebedor)))
        {
            //responde gritando
            System.out.println(preguntaBebedor.toUpperCase());
        }
        else
        {
            int caracteres = preguntaBebedor.length();
            if (caracteres % 2 == 0)
            {
                preguntaBebedor = "SI";
            }
            else
            {
                preguntaBebedor = "NO";
            }
        }

    }

    public void cogerCoche()
    {
        if (nivelAlcoholSangre > 0.26 && nivelAlcoholSangre <= 0.50)
        {
            System.out.println("Estas detenido vas a pasar 24 horas en la carcel");
        }
        else if (nivelAlcoholSangre > 0.50)
        {
           System.out.println("Estas detenido vas a pasar 72 horas en la carcel");
        }
        else 
        {
            System.out.println("No has llegado al limite, pero controlate.");
        }
    }
}
