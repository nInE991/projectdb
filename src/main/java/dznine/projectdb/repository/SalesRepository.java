package dznine.projectdb.repository;

import dznine.projectdb.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalesRepository extends JpaRepository<Sales, Integer> {
    @Override
    List<Sales> findAll();

    @Override
    <S extends Sales> S save(S s);
}
