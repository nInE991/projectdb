package dznine.projectdb.service;

import dznine.projectdb.entity.Buy;
import dznine.projectdb.entity.Logs;
import dznine.projectdb.entity.OrdersBalance;
import dznine.projectdb.repository.ActionRepository;
import dznine.projectdb.repository.BuyRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@Service
public class BuyService {
    @Inject
    BuyRepository buyRepository;
    @Inject
    OrdersBalanceService ordersBalanceService;
    @Inject
    LogsService logsService;
    @Inject
    ActionRepository actionRepository;

    public List<Buy> getList() {
        return buyRepository.findAll();
    }

    public void save(Buy buy) throws Exception {
        Logs logs = new Logs(buy.getDate(), actionRepository.getOne(2), buy.getComponents(), buy.getCount().doubleValue(), " Закупка № " + buyRepository.save(buy).getId());
        logsService.save(logs);
        OrdersBalance ordersBalance = ordersBalanceService.getBalance();
        ordersBalance.setBalance(ordersBalance.getBalance() - buy.getTotal());
        ordersBalanceService.saveBalance(ordersBalance);
    }

    public void delete(Integer id) throws Exception {
        Buy buy = buyRepository.getOne(id);
        OrdersBalance ordersBalance = ordersBalanceService.getBalance();
        ordersBalance.setBalance(ordersBalance.getBalance() + buy.getTotal());
        Logs logs = new Logs(new Date(), logsService.getAction(3), buy.getComponents(), buy.getCount() * -1.0, "Удаление закупки № " + buy.getId());
        logsService.save(logs);
        buyRepository.deleteById(buy.getId());
    }
}
