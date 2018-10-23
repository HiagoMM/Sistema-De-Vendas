package Repository;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import Logica.Pedido;

@Document
public interface PedidoRep extends MongoRepository<Pedido, String>{

}
