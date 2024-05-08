package co.litethinking.core.appbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.litethinking.core.appbackend.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String>{
    
}
