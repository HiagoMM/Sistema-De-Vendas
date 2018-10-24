package projeto.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projeto.domain.entities.Categoria;

@Repository
public interface CategoriaRep extends MongoRepository<Categoria, String>{

}
