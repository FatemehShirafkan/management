package com.card.cart.controller;

import com.card.cart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService service;

    @GetMapping("/getUserCarts/{username}")
    public ResponseEntity<?> getUserCarts(@PathVariable("username")String username){
        return ResponseEntity.ok(service.findByUser(username));
    }
}
