package dznine.projectdb.repository;

import dznine.projectdb.entity.Units;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitsRepository extends JpaRepository<Units, Integer> {
    @Override
    List<Units> findAll();

    @Override
    Units getOne(Integer integer);
}
