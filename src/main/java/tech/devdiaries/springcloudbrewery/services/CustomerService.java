package tech.devdiaries.springcloudbrewery.services;

import org.springframework.stereotype.Service;
import tech.devdiaries.springcloudbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);

    CustomerDto saveCustomer(CustomerDto customer);

    CustomerDto updateCustomer(UUID customerId, CustomerDto customerDto);

    CustomerDto deleteCustomer(UUID customerId);
}
