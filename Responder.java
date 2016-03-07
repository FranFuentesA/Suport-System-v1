import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private ArrayList<String> coleccionDeRespuestas;
    private Random aleatorio;
    private HashMap<String,String> palabras;
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
        //inizializo el array 
        palabras = new HashMap();
        palabras.put("hola", "Hola, ¿cual es su consulta?");
        palabras.put("error", "Cual es su incidendia");
        palabras.put("no se", "¿Puede ser mas claro?");
        palabras.put("gracias", "De nada");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String palabra)
    {		      
        String texto = ""; //inicializo un string vacio para meter la palabara pasada por el usuario
        if (palabras.containsKey(palabra))
        {
            texto = palabras.get(palabra);
        }
        else
        {
            texto = coleccionDeRespuestas.get(aleatorio.nextInt(coleccionDeRespuestas.size()));
        }
        return texto;		     
    }
}
