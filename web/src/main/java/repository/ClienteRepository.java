package repository;

import org.springframework.data.repository.CrudRepository;

import br.com.bytecompany.web.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
