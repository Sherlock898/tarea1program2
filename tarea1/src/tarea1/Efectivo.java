package tarea1;
import java.util.Date;

public class Efectivo extends Pago{
             
    public Efectivo(float monto, Date date){
        super(monto, date);
    }
    
    public float calcDevolucion(){
        
        return 0;
    }
    
    
}
