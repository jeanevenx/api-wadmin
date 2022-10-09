package br.com.wcoin.wadmin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wcoin.wadmin.models.Coin;
import br.com.wcoin.wadmin.repositories.CoinRepository;

@Service
public class CoinServiceImpl implements ICoinService {
	
	@Autowired
	private CoinRepository repo;

	@Override
	public List<Coin> getAllCoin() {
		
		return (List<Coin>) repo.findAll();
	}

	@Override
	public Coin getOneCoin(Integer id) {
	
		return repo.findById(id).orElse(null);
	}

	@Override
	public Coin updateCoin(Coin data) {
		if(data.getId()!= null) {
			return repo.save(data);
		}
		return null;
	}

	@Override
	public void deleteCoin(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Coin saveCoin(Coin data) {
		return repo.save(data);
	}
    
}
