package dznine.projectdb.repository;

import dznine.projectdb.entity.ProductStructure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsStructureRepository extends JpaRepository<ProductStructure, Integer> {
    @Override
    ProductStructure getOne(Integer integer);

    @Override
    <S extends ProductStructure> S save(S s);

    @Override
    void deleteById(Integer integer);
}
