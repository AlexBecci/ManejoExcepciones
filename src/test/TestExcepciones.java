package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    //Tipo de exception: RuntimeException
    //UncheackException ya que el compilador no marca error si el try y el catch no estuvieran el erro es en tiempo de ejecucion

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        } 
        //Si queremos agregar mas excepciones
        catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exception");
            // e.printStackTrace(System.out);//funciona sin el System.ou pero es recomendable utilizarlo
            System.out.println(e.getMessage());
        } finally//SIempre se va a ejecutar este bloque de codigo si tenemos un try o un catch
        {
            System.out.println("Entrando al bloquer finally\nSe reviso la division entre cero");
        }
        System.out.println("resul = " + resultado);

        System.out.println("Fin del programa");
    }
}
