package br.com.wcoin.wadmin.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.wcoin.wadmin.models.Role;
import br.com.wcoin.wadmin.enums.ERole;


@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{
    
    Optional<Role> findByName(ERole name);

}