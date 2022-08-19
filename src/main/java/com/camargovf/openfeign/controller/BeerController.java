package com.camargovf.openfeign.controller;

import com.camargovf.openfeign.client.response.BeerResponse;
import com.camargovf.openfeign.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/beer")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{id}")
    public List<BeerResponse> buscarPorId(@PathVariable Long id) { return beerService.getBeerById(id); }

    @GetMapping("/random")
    public List<BeerResponse> getRandomBeer() { return  beerService.getRandomBeer(); }

}
