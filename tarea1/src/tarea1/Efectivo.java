package tarea1;
import java.util.Date;

public class Efectivo extends Pago{
    private float vuelto;
             
    public Efectivo(float monto, Date date){
        super(monto, date);
        vuelto = 0;
    }
    
    public void calcDevolucion(float deuda){
        vuelto = super.getMonto() - deuda;
    }

    public String toString(){
        return super.toString() + " vuelto: " + vuelto;
    }
    
    
}
