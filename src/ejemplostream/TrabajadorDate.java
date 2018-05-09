
package ejemplostream;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrabajadorDate{
    String nombre;
    Date data_alta;

    public TrabajadorDate(){

    }

    public TrabajadorDate(String nombre, String alta) throws ParseException{
        this.nombre=nombre;
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); // Creamos un formato de fecha
        data_alta = format.parse(alta); // Creamos un date con la entrada en el formato especificado
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public Date getData_alta(){
        return data_alta;
    }

    public void setData_alta(Date data_alta){
        this.data_alta=data_alta;
    }

    @Override
    public String toString(){
        return "nombre="+nombre+", data_alta="+data_alta;
    }
    
    
}
