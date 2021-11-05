package audiofile.msscbrewery.service.v2;


import audiofile.msscbrewery.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    Object getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
