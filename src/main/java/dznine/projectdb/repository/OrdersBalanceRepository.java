package dznine.projectdb.repository;

import dznine.projectdb.entity.OrdersBalance;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrdersBalanceRepository extends CrudRepository<OrdersBalance,Integer> {
    @Override
    Optional<OrdersBalance> findById(Integer integer);
}
