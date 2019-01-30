package dznine.projectdb.repository;

import dznine.projectdb.entity.Buy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyRepository extends JpaRepository<Buy, Integer> {
    @Override
    <S extends Buy> S save(S s);

    @Override
    void deleteById(Integer integer);

    @Override
    Buy getOne(Integer integer);

}
