package tarea1;
import java.util.Date;

public class Tarea1 {

    public static void main(String[] args) {
        Date ayer = new Date(1);
        Direccion d1 = new Direccion("Sauce 44, villa jazmin, penco");
        Cliente baston = new Cliente("Bastian Saul Bustos Muñoz", "21161420-k", d1);
        Cliente bastan = new Cliente("La mama del baston", "777-7", d1);
        Articulo vBucks = new Articulo(1, 500, "vBucks", "vBucks para comprar skins de fornite");
        Articulo cincoPeso = new Articulo(2, 6, "Cinco Pesos", "Cinco pesos");
        Articulo valorantPoints = new Articulo(1000, 100, "Riot points", "Para comprar más skins de fornite");
        Articulo tareaDeProgram2 = new Articulo(5, 5000, "Tarea de program 2", "Que vola es terrible cara la tarea");
        Articulo etesech = new Articulo(99999, 99999, "???", "??????");
        
        OrdenCompra o1 = new OrdenCompra(baston, ayer, "12");
        OrdenCompra o2 = new OrdenCompra(bastan, ayer , "15");
        OrdenCompra o3 = new OrdenCompra(baston, ayer, "17");
        o1.addProducto(etesech, 5);
        o1.addProducto(vBucks, 90);
        o2.addProducto(tareaDeProgram2, 1);
        o2.addProducto(valorantPoints, 30000);
        o2.addProducto(etesech, 1);
        o3.addProducto(valorantPoints, 15);
        o3.addProducto(cincoPeso, 4);
        
        System.out.println(o1.toString());
        Tarjeta tarjetaDeLaMamaDelBaston = new Tarjeta(648544.06f, ayer, "Debito", "666");
        o1.addPago(tarjetaDeLaMamaDelBaston);
        System.out.println(o1.toString());

        Transferencia bancoEstado = new Transferencia(500, ayer, "10" , "102");
        o2.addPago(bancoEstado);
        System.out.println(o2.toString());
        Efectivo ahorrosDelBaston = new Efectivo(1, ayer);
        Tarjeta prestaLuca = new Tarjeta(3694448.0f, ayer, "suu", "20");
        o2.addPago(ahorrosDelBaston);
        o2.addPago(prestaLuca);
        System.out.println(o2.toString());

        System.out.println(o3.toString());
        Efectivo billeteDeDiezmil = new Efectivo(10000, ayer);
        o3.addPago(billeteDeDiezmil);
        System.out.println(o3.toString());

    }
    
}
