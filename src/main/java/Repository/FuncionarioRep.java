package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Logica.Funcionario;

@Repository
public interface FuncionarioRep extends MongoRepository<Funcionario, String> {

}
