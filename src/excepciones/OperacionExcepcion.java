package excepciones;

public class OperacionExcepcion extends RuntimeException {

    //Esta clase va a ser de tipo CheackException
    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
//q excepcion utilizar
    //Se recomienda mas utilizar RuntimeException
    //y utilizamos try/catch solo si sabemos la excepcion
}
