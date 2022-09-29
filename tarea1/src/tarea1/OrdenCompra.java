package tarea1;
import java.util.Date;
import java.util.ArrayList;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detalles;
    
    public OrdenCompra(Date fecha, String estado){
        this.fecha = fecha;
        this.estado = estado;
        detalles = new ArrayList<DetalleOrden>();
    }
    
    public void addDetalle(DetalleOrden detalle){
        detalles.add(detalle);
    }
    
    public float calcPrecio(){
        float precio = 0;
        for(int i = 0; i < detalles.size(); i++){
            precio += detalles.get(i).calcPrecio();
        }
        return precio;
    }
    
    public float calcPrecioSinIVA(){
        float precio = 0;
        for(int i = 0; i < detalles.size(); i++){
            precio += detalles.get(i).calcPrecioSinIVA();
        }
        return precio;
    }
    
    public float calcIVA(){
        float iva = 0;
        for(int i = 0; i < detalles.size(); i++){
            iva += detalles.get(i).calcIVA();
        }
        return iva;
    }
    
    public float calcPeso(){
        float peso = 0;
        for(int i = 0; i < detalles.size(); i++){
            peso += detalles.get(i).calcPeso();
        }
        return peso;
    }
}
