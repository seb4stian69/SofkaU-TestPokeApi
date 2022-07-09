package org.sofka.GetPokeApi;

import org.jboss.logging.Logger;
import utilities.GetPokeData;
public class GetPokeApi {

    private static final Logger log = Logger.getLogger("log");

    public static void main(String[] args) {

        GetPokeData data = new GetPokeData();

        if(data.makeApiConection()){
            log.info("Conexion realizada");
        }else{
            log.error("Ocurrio un error");
        }

    }

}
