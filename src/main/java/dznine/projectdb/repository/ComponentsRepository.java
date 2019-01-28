package dznine.projectdb.repository;

import dznine.projectdb.entity.Components;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComponentsRepository extends JpaRepository<Components, Integer> {
    @Modifying
    @Query("select new Components(components.id,components.name,balance,units) from Components components inner join ComponentBalance balance on components.componentBalance.id = balance.id inner join Units units on components.units.id = units.id")
    List<Components> findAll();

    @Override
    <S extends Components> S save(S s);

    @Override
    void deleteById(Integer integer);

    @Override
    Components getOne(Integer integer);
}
