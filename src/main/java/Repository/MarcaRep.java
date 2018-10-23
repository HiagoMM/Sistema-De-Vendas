package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Logica.Marca;

@Repository
public interface MarcaRep extends MongoRepository<Marca, String>{

}