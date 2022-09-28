package tarea1;
import java.util.Date;

public class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    
    public Tarjeta(float monto, Date date, String tipo, String numTransaccion){
        super(monto, date);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
}
