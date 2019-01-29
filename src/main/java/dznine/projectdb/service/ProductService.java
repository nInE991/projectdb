package dznine.projectdb.service;

import dznine.projectdb.entity.ProductStructure;
import dznine.projectdb.entity.Products;
import dznine.projectdb.repository.ComponentsRepository;
import dznine.projectdb.repository.ProductsRepository;
import dznine.projectdb.repository.ProductsStructureRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ProductService {
    @Inject
    ProductsRepository productsRepository;

    @Inject
    ComponentsRepository componentsRepository;
    @Inject
    ProductsStructureRepository productsStructureRepository;

    public List<Products> getAll() {
        return productsRepository.findAll();
    }

    public Products save(Products products) {
        return productsRepository.save(products);
    }

    public Products getOne(Integer id) {
        return productsRepository.getOne(id);
    }

    public List<ProductStructure> getallbyProducts(Integer id) {
        return productsStructureRepository.findAllbyProducts(id);
    }

    public ProductStructure saveProductStruct(ProductStructure productStructure) {
        return productsStructureRepository.save(productStructure);
    }

    public void deletebyId(Integer id) {
        productsStructureRepository.deletebyActionId(id);
        productsRepository.deleteById(id);
    }

    public void deleteStructProduct(Integer id) {
        productsStructureRepository.deleteById(id);
    }
}
