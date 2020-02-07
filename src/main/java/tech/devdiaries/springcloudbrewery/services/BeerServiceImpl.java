package tech.devdiaries.springcloudbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.devdiaries.springcloudbrewery.web.model.BeerDto;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto save(BeerDto beer) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return BeerDto.builder().id(beerId).build();
    }

    @Override
    public BeerDto deleteBeer(UUID beerId) {
        log.debug("Deleting beer..");
        return null;
    }
}
