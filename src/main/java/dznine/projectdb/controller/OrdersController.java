package dznine.projectdb.controller;

import dznine.projectdb.entity.Orders;
import dznine.projectdb.repository.OrdersRepository;
import dznine.projectdb.service.ComponentService;
import dznine.projectdb.service.CounterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.inject.Inject;
import java.util.List;

@Controller
public class OrdersController {
    @Inject
    OrdersRepository ordersRepository;
    @Inject
    ComponentService componentService;
    @Inject
    CounterService counterService;
    @GetMapping("/orders")
    public String index(Model model) {
        List<Orders> ordersList = ordersRepository.findAll();
        model.addAttribute("ordersList", ordersList);
        return "/orders/orders";
    }

    @GetMapping("/orders/buy")
    public String getbuy(Model model) {
        model.addAttribute("componentsList", componentService.getAll());
        model.addAttribute("counterList", counterService.getAll());
        return "/orders/buyindex";
    }
}
