package br.com.wcoin.wadmin.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.wcoin.wadmin.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
