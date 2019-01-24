package dznine.projectdb.controller;

import dznine.projectdb.entity.Orders;
import dznine.projectdb.repository.OrdersRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.inject.Inject;
import java.util.List;

@Controller
public class OrdersController {
    @Inject
    OrdersRepository ordersRepository;

    @GetMapping("/orders")
    public String index(Model model) {
        List<Orders> ordersList = ordersRepository.findAll();
        model.addAttribute("ordersList", ordersList);
        return "/orders/orders";
    }
}
