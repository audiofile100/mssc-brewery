package audiofile.msscbrewery.service;

import audiofile.msscbrewery.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
