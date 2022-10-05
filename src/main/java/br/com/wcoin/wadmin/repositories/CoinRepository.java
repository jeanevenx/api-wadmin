package br.com.wcoin.wadmin.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.wcoin.wadmin.models.Coin;

public interface CoinRepository extends CrudRepository<Coin, Integer>{
    
}
