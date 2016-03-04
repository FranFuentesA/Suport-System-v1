import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private ArrayList<String> coleccionDeRespuestas;
    private Random aleatorio;
        
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        coleccionDeRespuestas = new ArrayList<String>();
        aleatorio= new Random(); 
        
        coleccionDeRespuestas.add("Bienvenido al servicio de asistencia");
        coleccionDeRespuestas.add("Indique que necesita resolver, por favor");
        coleccionDeRespuestas.add("Incorrecto");
        coleccionDeRespuestas.add("Correcto");
        coleccionDeRespuestas.add("Espero que su incidencia este resuelta, hasta pronto");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
         return coleccionDeRespuestas.get(aleatorio.nextInt(coleccionDeRespuestas.size()));
    }
}
