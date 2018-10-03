
package unitec.primavera;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioMensajes extends MongoRepository<Mensajito, String>{
    
}
