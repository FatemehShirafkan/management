package com.shirafkan.customer1.repository;


import com.shirafkan.customer1.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    CustomerEntity findByUsername(String username);
}
