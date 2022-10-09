package tarea1;
import java.util.Date;
import java.util.ArrayList;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private DocTributario doc;
    private ArrayList<DetalleOrden> detalles;
    private ArrayList<Pago> pagos;
    private Cliente cliente;
    private float deuda;
    
    public OrdenCompra(Cliente cliente, Date fecha, String numero){
        estado = "No resuelto";
        deuda = 0;
        this.cliente = cliente;
        this.fecha = fecha;
        detalles = new ArrayList<DetalleOrden>();
        pagos = new ArrayList<Pago>();
        doc = new DocTributario(numero, cliente.getRut(), fecha, cliente.getDireccion());
    }
    
    public void addProducto(Articulo articulo, int cantidad){
        estado = "No resuelto";
        DetalleOrden dO = new DetalleOrden(articulo, cantidad);
        detalles.add(dO);
        deuda += dO.calcPrecio();
    }

    public void addPago(Pago pago){
        pagos.add(pago);
        if(deuda - pago.getMonto() > 0){
            deuda -= pago.getMonto();
            return;
        }
        if(deuda - pago.getMonto() == 0){
            estado = "Resuelto";
            deuda = 0;
            return;
        }
        estado = "Resuelto";
        deuda = 0;

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
        return fecha.toString() + " " + estado + ". " + cliente.toString() + "\n    Peso: " + this.calcPeso() + "Kg Precio: $" + this.calcPrecio() + " Por Pagar: " + deuda;
    }
}
