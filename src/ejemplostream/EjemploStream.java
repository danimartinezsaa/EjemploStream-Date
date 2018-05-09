
package ejemplostream;

import java.text.ParseException;

public class EjemploStream{

    public static void main(String[] args) throws ParseException{
        TrabajadorDate trabajador=new TrabajadorDate("Dani","06/12/2015");
        
        Metodos.crearListaAlumnos();
        Metodos.ordenar();
        Metodos.subirNota();
        Metodos.tiempoHastaHoy(trabajador);
    }
    
}
