package dznine.projectdb.repository;

import dznine.projectdb.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {
    @Override
    List<Products> findAll();

    @Override
    Products getOne(Integer integer);

    @Override
    <S extends Products> S save(S s);
}
