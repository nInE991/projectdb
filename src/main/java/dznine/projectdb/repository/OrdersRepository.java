package dznine.projectdb.repository;

import dznine.projectdb.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

    @Modifying
    @Query("select new dznine.projectdb.entity.Orders(order.id,order.date,order.total,order.note,orderActions,counterparties) " +
            "from Orders order inner join OrdersActions orderActions on order.ordersActions.id =orderActions.id inner join Counterparties counterparties on  order.counterparties.id = counterparties.id")
    List<Orders> findAll();
}
