package com.card.cart.service;

import com.card.cart.client.ProductClient;
import com.card.cart.client.CustomerClient;
import com.card.cart.entity.CartEntity;
import com.card.cart.entity.dto.CustomerDTO;
import com.card.cart.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository repository;
    private final CustomerClient customerClient;
    private final ProductClient productClient;


    public List<CartEntity> findByUser(String username) {
        CustomerDTO user = customerClient.findCustomer(username);
        return repository.findByUserId(user.getId());
    }
}
