package utilities;

import java.net.*;
import java.io.IOException;
public class GetPokeData {

    public GetPokeData(){/*Constructor void*/}

    public Boolean makeApiConection(){

        try {

            // Realizar conexion

            URL url = new URL("https://pokeapi.co/api/v2/ability/1/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            // Codigo de respuesta

            int codigoRespuesta = connection.getResponseCode();

            if(codigoRespuesta != 200){

                RuntimeException myException = new RuntimeException("Ocurrion un error, la respuesta HTTP:" + codigoRespuesta);
                return false;

            }else{

                return true;

            }

        } catch (IOException | RuntimeException e) {
            return false;
        }

    }

}
