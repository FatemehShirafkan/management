package com.card.cart.client;

import com.card.cart.entity.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "${application.config.product-url}")
public interface ProductClient {
    @GetMapping("/getProducts/{title}")
    ProductDTO getProducts(@PathVariable("title") String title);
}
