package Repository;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import Logica.Endereco;

@Document
public interface EnderecoRep extends MongoRepository<Endereco, String>{

}
