
package unitec.primavera;

public class TarjetaNomina extends Tarjeta implements Pagos{

    @Override
    public void pagar() {
        System.out.println("Pagando nómina");
    }
    
}
