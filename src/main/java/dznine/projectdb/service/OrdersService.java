package dznine.projectdb.service;

import dznine.projectdb.repository.BuyRepository;
import dznine.projectdb.repository.OrdersBalanceRepository;
import dznine.projectdb.repository.OrdersRepository;
import dznine.projectdb.repository.SalesRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class OrdersService {
    @Inject
    BuyRepository buy;
    @Inject
    OrdersRepository orders;
    @Inject
    SalesRepository salesRepository;
    @Inject
    OrdersBalanceRepository ordersBalance;

    public Double getBalace() {
        return ordersBalance.getOne(1).getBalance();
    }
}
