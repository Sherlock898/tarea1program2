package tarea1;

public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    
    public DetalleOrden(Articulo articulo, int cantidad){
        this.cantidad = cantidad;
        this.articulo = articulo;        
    }
    
    public float calcPrecio(){
        return articulo.getPrecio() * cantidad * 1.19f;
    }
    
    public float calcPrecioSinIVA(){
        return articulo.getPrecio() * cantidad;
    }
    
    public float calcIVA(){
        return articulo.getPrecio() * cantidad * 0.19f;
    }
    
    public float calcPeso(){
        return articulo.getPeso() * cantidad;
    }
    
    public String toString(){
        return Integer.toString(cantidad) + articulo.toString();
    }
}
