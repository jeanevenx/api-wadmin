package br.com.wcoin.wadmin.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.wcoin.wadmin.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    
}
