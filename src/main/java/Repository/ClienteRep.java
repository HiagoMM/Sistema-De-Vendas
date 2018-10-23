package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Logica.Cliente;

@Repository
public interface ClienteRep extends MongoRepository<Cliente, String> {

}
