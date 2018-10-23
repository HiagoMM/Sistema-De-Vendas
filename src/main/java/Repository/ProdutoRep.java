package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Logica.Produto;

@Repository
public interface ProdutoRep extends MongoRepository<Produto, String>{

}
