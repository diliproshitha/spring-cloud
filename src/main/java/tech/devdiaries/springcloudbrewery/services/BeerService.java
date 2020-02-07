package tech.devdiaries.springcloudbrewery.services;

import tech.devdiaries.springcloudbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto save(BeerDto beer);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto deleteBeer(UUID beerId);
}
