package tarea1;
import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
    
    public Pago(float monto, Date fecha){
        this.monto = monto;
        this.fecha = fecha;
    }

    public float getMonto(){
        return monto;
    }
    
    public String toString(){
        return fecha + " Monto: " + monto; 
    }

}
