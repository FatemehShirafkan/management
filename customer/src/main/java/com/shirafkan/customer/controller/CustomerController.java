package com.shirafkan.customer.controller;



import com.shirafkan.customer.entity.CustomerEntity;
import com.shirafkan.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/getCustomer/{username}")
    public ResponseEntity<?> getCustomer(@PathVariable("username")String username){

        CustomerEntity customer = customerService.findCustomer(username);
        System.out.println(customer.getUsername());
        return ResponseEntity.ok(customer);
    }
}
