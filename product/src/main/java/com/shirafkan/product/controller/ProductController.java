package com.shirafkan.product.controller;

import com.shirafkan.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/getProducts/{title}")
    public ResponseEntity<?> getProducts(@PathVariable("title")String title){
        return ResponseEntity.ok(productService.findByTitle(title));
    }
}
