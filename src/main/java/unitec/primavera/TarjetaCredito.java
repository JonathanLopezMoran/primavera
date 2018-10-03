
package unitec.primavera;

public class TarjetaCredito extends Tarjeta implements Pagos{

    @Override
    public void pagar() {
        System.out.println("Pagando crédito");
    }
    
}
