package com.shirafkan.customer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.shirafkan.customer.repository.CustomerRepository;
import com.shirafkan.customer.entity.CustomerEntity;


@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerEntity findCustomer(String username) {
        return customerRepository.findByUsername(username);
    }

    ;
}
