package audiofile.msscbrewery.service;

import audiofile.msscbrewery.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
