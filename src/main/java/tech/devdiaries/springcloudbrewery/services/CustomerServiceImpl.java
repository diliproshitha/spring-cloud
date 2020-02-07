package tech.devdiaries.springcloudbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.devdiaries.springcloudbrewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("TEST NAME")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customer) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public CustomerDto updateCustomer(UUID customerId, CustomerDto customerDto) {
        return CustomerDto.builder().id(customerId).build();
    }

    @Override
    public CustomerDto deleteCustomer(UUID customerId) {
        log.debug("Deleting customer....");
        return null;
    }
}
