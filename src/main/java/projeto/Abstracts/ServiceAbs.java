package projeto.Abstracts;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import projeto.Exception.erro;
import projeto.Interfaces.Identificable;


public abstract class ServiceAbs <T extends Identificable>{
	
	protected MongoRepository<T,String> repository;
	
	public ServiceAbs(MongoRepository<T,String> repository) {
		this.repository = repository;
	}
	
	public List<T> getAll() {  //READ ALL
		return repository.findAll();
	}
	
	public T getById(String id) { //READ BY ID
		return repository.findById(id).get() ;
	}
	
	public T add(T t) { // ADD 
		return repository.insert(t);
		
	}
	
	public T atualiza( T t) throws erro{ // ATUALIZA
		if (repository.existsById(t.getId())) {
			return repository.save(t);
		}throw new erro("Id não encontrado!!");
	}
	
	
	public void deleta( String id ) throws erro { // DELETE
		if (repository.existsById(id)) {
			repository.deleteById(id); 
		}else{
			throw new erro("Não foi apagado!! ID errado ou não existe"); 
		}
	}
		
}
