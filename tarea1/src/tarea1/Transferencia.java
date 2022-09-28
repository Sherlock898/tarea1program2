package tarea1;
import java.util.Date;

public class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    
    public Transferencia(float monto, Date date, String banco, String numCuenta){
        super(monto, date);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
}