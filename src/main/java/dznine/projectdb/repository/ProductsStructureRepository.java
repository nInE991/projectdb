package dznine.projectdb.repository;

import dznine.projectdb.entity.ProductStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductsStructureRepository extends JpaRepository<ProductStructure, Integer> {
    @Override
    ProductStructure getOne(Integer integer);

    @Override
    <S extends ProductStructure> S save(S s);

    @Override
    void deleteById(Integer integer);

    @Modifying
    @Query("select productStruct from ProductStructure productStruct where productStruct.products.id = ?1")
    List<ProductStructure> findAllbyProducts(Integer id);

    @Transactional
    @Modifying
    @Query("delete  from ProductStructure productStruct where productStruct.products.id = ?1")
    void deletebyActionId(Integer id);
}
