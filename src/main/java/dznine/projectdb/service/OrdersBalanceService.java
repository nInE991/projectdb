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
//
//    public Actions getbyId(Integer id){ return actionRepository.getOne(id);}
//
//    public void addBuyOrder(Integer comp, Date date,Integer counter,Double price,Integer count) throws Exception {
//        Counterparties counterparties = counterService.getbyId(counter);
//        Components components = componentService.getComp(comp);
//        Orders orders =new Orders();
//        orders.setDate(date);
//        orders.setActions(getbyId(2));
//        orders.setCounterparties(counterparties);
//        orders.setTotal(price*count);
//
//        this.save(orders);
//        OrdersBalance ordersBalance =getOrdersBalance();
//        ordersBalance.setBalance(ordersBalance.getBalance()-orders.getTotal());
//        saveBalance(ordersBalance);
//        Buy buy = new Buy();
//        buy.setPrice(price);
//        buy.setCount(count);
//        buy.setComponents(components);
//        buy.setOrders(this.save(orders));
//        buyRepository.save(buy);
//        Logs logs = new Logs();
//        logs.setComponents(components);
//        logs.setDate(date);
//        logs.setActions(getbyId(2));
//        logs.setNote(buy.getOrders().getId().toString());
//        logs.setComponents(components);
//        logs.setCount(count.floatValue());
//        logsService.save(logs);
//    }
//
//    public Orders save(Orders order){
//    return ordersRepository.save(order);
//    }
//
//    public void DeleteOrders(Integer id){
//        Orders orders = ordersRepository.findById(id).get();
//        if(orders.getActions().getId()==2){
//            OrdersBalance ordersBalance =getOrdersBalance();
////            ordersBalance.setBalance(ordersBalance.getBalance()+orders.getTotal());
////            saveBalance(ordersBalance);
//            appConfig.logger().info(orders.getId().toString());
//            appConfig.logger().info(buyRepository.findByOrder(orders.getId()).getOrders().getId().toString());
////            buyRepository.deleteById(buy.getId());
////            ordersRepository.deleteById(orders.getId());
//        }else if(orders.getActions().getId()==1){
//
//        }
//    }
}
