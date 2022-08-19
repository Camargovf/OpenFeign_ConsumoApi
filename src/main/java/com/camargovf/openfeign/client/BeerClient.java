package com.camargovf.openfeign.client;

import com.camargovf.openfeign.client.response.BeerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "BeerClient", url = "https://api.punkapi.com/v2/beers")
public interface BeerClient {

    @GetMapping(value = "/random")
    List<BeerResponse> getRandomBeer();

    @GetMapping(value = "/{id}")
    List<BeerResponse> getBeerById(@PathVariable("id") Long id);

}
