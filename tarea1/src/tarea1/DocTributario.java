package tarea1;
import java.util.Date;

public class DocTributario{
    private String numero;
    private String rut;
    private Direccion direccion;
    private Date fecha;

    public DocTributario(String numero, String rut, Date fecha, Direccion direccion){
        this.numero = numero;
        this.fecha = fecha;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String toString(){
        return numero + " Rut: " + rut + " " + fecha;
    }
}