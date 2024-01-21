package com.card.cart.client;

import com.card.cart.entity.dto.CustomerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", url = "${application.config.user-url}")
public interface CustomerClient {

    @GetMapping("/getCustomer/{username}")
    CustomerDTO findCustomer(@PathVariable("username")String username);
}
