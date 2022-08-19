package com.camargovf.openfeign.service;

import com.camargovf.openfeign.client.BeerClient;
import com.camargovf.openfeign.client.response.BeerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeerService {

    private final BeerClient beerClient;

    public List<BeerResponse> getRandomBeer(){
        return beerClient.getRandomBeer();

    }

    public List<BeerResponse> getBeerById(Long id) {
        return beerClient.getBeerById(id);

    }
}
