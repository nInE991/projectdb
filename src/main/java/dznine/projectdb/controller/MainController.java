package dznine.projectdb.controller;

import dznine.projectdb.repository.OrdersBalanceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
public class MainController {
    @Inject
    OrdersBalanceRepository balanceRepository;
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
    @GetMapping(value = "/balance",produces = {"application/json"})
    public @ResponseBody String getBalance(){
        return  balanceRepository.findById(1).get().getBalance().toString();
    }
}
