package dznine.projectdb.service;

import dznine.projectdb.entity.OrdersBalance;
import dznine.projectdb.repository.OrdersBalanceRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class OrdersBalanceService {

    @Inject
    OrdersBalanceRepository ordersBalance;

    public Double getBalanceDouble() {
        return ordersBalance.getOne(1).getBalance();
    }

    public OrdersBalance getBalance() {
        return ordersBalance.findById(1).get();
    }

    public void saveBalance(OrdersBalance balance) {
        ordersBalance.save(balance);
    }
}
