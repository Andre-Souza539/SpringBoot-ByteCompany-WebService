package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bytecompany.web.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long>{

}
