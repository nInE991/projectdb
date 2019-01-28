package dznine.projectdb.service;

import dznine.projectdb.entity.Products;
import dznine.projectdb.repository.ComponentsRepository;
import dznine.projectdb.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ProductService {
    @Inject
    ProductsRepository productsRepository;

    @Inject
    ComponentsRepository componentsRepository;

    public List<Products> getAll() {
        return productsRepository.findAll();
    }

    public Products save(Products products) {
        return productsRepository.save(products);
    }
}
