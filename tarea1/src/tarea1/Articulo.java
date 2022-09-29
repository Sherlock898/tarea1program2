package tarea1;

public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    
    public Articulo(float peso, float precio, String nombre, String descripcion){
        this.peso = peso;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public float getPrecio(){
        return precio;
    }
}
