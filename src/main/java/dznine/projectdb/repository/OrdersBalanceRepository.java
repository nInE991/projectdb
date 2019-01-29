package dznine.projectdb.repository;

import dznine.projectdb.entity.OrdersBalance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrdersBalanceRepository extends JpaRepository<OrdersBalance, Integer> {
    @Override
    Optional<OrdersBalance> findById(Integer integer);

    @Override
    OrdersBalance getOne(Integer integer);
}
