package br.com.wcoin.wadmin.services;

import br.com.wcoin.wadmin.models;

public interface ICoinService {
    private Coin saveCoin(Coin data);
    private List<Coin> getAllCoin();
    private Coin getOneCoin(integer id);
    private Coin updateCoin(Coin data);
    private void deleteCoin(integer id);
}
