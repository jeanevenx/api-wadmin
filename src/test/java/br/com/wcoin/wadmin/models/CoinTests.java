package br.com.wcoin.wadmin.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CoinTests {

    @Test
    void validateCoinProps(){

        Coin coin = new Coin();

        coin.setId(1);
        coin.setName("Bitcoin");
        coin.setQuantity(158.658425);
        coin.setSymbol("BTC");
        coin.setOrigin("Binance");
        coin.setLogo("http://bit.logo");

        assertEquals(1, coin.getId());
        assertEquals("Bitcoin", coin.getName());
        assertEquals(158.658425, coin.getQuantity());
        assertEquals("BTC", coin.getSymbol());
        assertEquals("Binance", coin.getOrigin());
        assertEquals("http://bit.logo", coin.getLogo());
        
    }
    
}
