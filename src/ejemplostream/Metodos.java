
package ejemplostream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Metodos{
    static ArrayList<Alumno>alumnos=new ArrayList();
    static List<Alumno>suspensos;
    
    
    public static void crearListaAlumnos(){
        alumnos.add(new Alumno("111","Ana","dam1",4));
        alumnos.add(new Alumno("222","Ana","dam1",8));
        alumnos.add(new Alumno("333","Anton","dam2",6));
        alumnos.add(new Alumno("444","Brais","fpb",5));
        alumnos.add(new Alumno("555","Alex","dam1",3));
        alumnos.add(new Alumno("666","Noa","adm",7));
    }

    public static void mostrar(){
        alumnos.stream().forEach(a->System.out.println(a));
        //Referencias a métodos
        alumnos.stream().forEach(System.out::println);
    }
    
    public static void mostrarAlumnoDeterminado(){
        alumnos.stream().filter(a-> a.getNombre().startsWith("A")).forEach(System.out::println);
    }
    
    public static void aprobados(){
        alumnos.stream().filter(a->a.getNota()>=5).forEach(System.out::println);
    }
    
    public static void listaSuspensos(){
        suspensos=alumnos.stream().filter(a->a.getNota()<5).collect(Collectors.toList());
        suspensos.stream().forEach(System.out::println);
    }
    
    public static void buscarAlumnoDNI(){
        alumnos.stream().filter(a->a.getDni().equals("555")).forEach(System.out::println);
    }
    
    public static void notaAlta(){
        System.out.println(alumnos.stream().max((p1, p2) -> Integer.compare( p1.getNota(), p2.getNota())).get());
    }
    
    public static void ordenar(){
        alumnos.stream().sorted((p1, p2) -> p1.getNombre().compareTo(p2.getNombre())).forEach(System.out::println);
    }
    
    public static void subirNota(){
        alumnos.stream().map(al->al.getNota()+2).forEach(System.out::println);
    }
    
    public static void subirNotaAprobados(){
        alumnos.stream().filter(al->al.getNota()>=5).map(al->al.getNota()+2).forEach(System.out::println);
    }
    
    public static void tiempoHastaHoy(TrabajadorDate tr){
        Date alta=tr.getData_alta();
        Date hoy=new Date();
        long mhoy=hoy.getTime();
        long malta=alta.getTime();
        System.out.println("Antiguedad "+(mhoy-malta)/(1000.0*3600*24*365)+" años.");
    }
}
