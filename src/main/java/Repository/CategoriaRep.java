package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Logica.Categoria;

@Repository
public interface CategoriaRep extends MongoRepository<Categoria, String>{

}
