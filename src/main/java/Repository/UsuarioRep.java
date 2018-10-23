package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Logica.Usuario;

@Repository
public interface UsuarioRep extends MongoRepository<Usuario, String>{

}
