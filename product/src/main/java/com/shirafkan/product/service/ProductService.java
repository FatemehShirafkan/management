package com.shirafkan.product.service;

import com.shirafkan.product.entity.ProductEntity;
import com.shirafkan.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public List<ProductEntity> findByTitle(String title){return repository.findByTitleLike(title);}
}
