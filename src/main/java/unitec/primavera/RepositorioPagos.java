
package unitec.primavera;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositorioPagos {
    
    void servicioPagar(){
        new TarjetaNomina().pagar();
    }
}
