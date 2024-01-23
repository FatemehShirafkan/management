package com.shirafkan.customer1.service;

import com.shirafkan.customer1.entity.CustomerEntity;
import com.shirafkan.customer1.repository.CustomerRepository;
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
