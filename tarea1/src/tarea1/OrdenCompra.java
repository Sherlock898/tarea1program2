package tarea1;
import java.util.Date;
import java.util.ArrayList;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detalles;
    private Cliente cliente;
    
    public OrdenCompra(Cliente cliente, Date fecha, String estado){
        this.cliente = cliente;
        this.fecha = fecha;
        this.estado = estado;
        detalles = new ArrayList<DetalleOrden>();
    }
    
    public void addProducto(Articulo articulo, int cantidad){
        DetalleOrden dO = new DetalleOrden(articulo, cantidad);
        detalles.add(dO);
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
    
    public String toString(){
        return fecha.toString() + " " + estado + " " + cliente.toString() + "\n    Peso: " + this.calcPeso() + "Kg Precio: $" + this.calcPrecio();
    }
}
