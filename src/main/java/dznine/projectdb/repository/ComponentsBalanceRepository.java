package dznine.projectdb.repository;

import dznine.projectdb.entity.ComponentBalance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentsBalanceRepository extends JpaRepository<ComponentBalance,Integer> {
    @Override
    <S extends ComponentBalance> S save(S s);

    @Override
    void deleteById(Integer integer);

    @Override
    ComponentBalance getOne(Integer integer);
}
