package com.card.cart.service;

import com.card.cart.client.ProductClient;
import com.card.cart.client.UserClient;
import com.card.cart.entity.CartEntity;
import com.card.cart.entity.dto.UserDTO;
import com.card.cart.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository repository;
    private final UserClient userClient;
    private final ProductClient productClient;


    public List<CartEntity> findByUser(String username) {
        UserDTO user = userClient.findUser(username);
        return repository.findByUserId(user.getId());
    }
}
