package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Logica.Venda;

@Repository
public interface VendaRep extends MongoRepository<Venda, String >{

}
