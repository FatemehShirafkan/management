package com.shirafkan.customer.service;

import com.shirafkan.customer.entity.CustomerEntity;
import com.shirafkan.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerEntity findCustomer(String username) {
        return customerRepository.findByUsername(username);
    }

    ;
}
