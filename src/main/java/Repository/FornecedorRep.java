package Repository;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import Logica.Fornecedor;

@Document
public interface FornecedorRep extends MongoRepository<Fornecedor, String>{

}
