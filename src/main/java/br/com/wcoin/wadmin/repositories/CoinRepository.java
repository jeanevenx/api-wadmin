package br.com.wcoin.wadmin.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.wcoin.wadmin.models.Coin;

public interface CoinRepository extends CrudRepository<Coin, Integer>{

    @Query("SELECT q FROM Coin q WHERE q.id = :id")
	public Coin getCoinId(Integer id);
}
