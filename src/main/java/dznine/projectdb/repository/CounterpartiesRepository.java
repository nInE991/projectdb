package dznine.projectdb.repository;

import dznine.projectdb.entity.Counterparties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CounterpartiesRepository extends JpaRepository<Counterparties, Integer> {

    @Modifying
    @Query(value = "SELECT parties FROM Counterparties parties")
    List<Counterparties> findAll();

    @Override
    Optional<Counterparties> findById(Integer integer);

    @Override
    <S extends Counterparties> S save(S s);

    @Override
    void deleteById(Integer ainteger);

}


