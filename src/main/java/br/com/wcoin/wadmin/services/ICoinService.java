package br.com.wcoin.wadmin.services;

import java.util.List;

import br.com.wcoin.wadmin.models.Coin;

public interface ICoinService {
    public List<Coin> getAllCoin();
    public Coin getOneCoin(Integer id);
    public Coin updateCoin(Coin data);
    public void deleteCoin(Integer id);
    public Coin saveCoin(Coin data);
}
