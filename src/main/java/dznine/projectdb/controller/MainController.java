package dznine.projectdb.controller;

import dznine.projectdb.config.AppConfig;
import dznine.projectdb.service.OrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
public class MainController {
    @Inject
    AppConfig appConfig;
    @Inject
    OrdersService ordersService;
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
    @GetMapping(value = "/balance",produces = {"application/json"})
    public @ResponseBody String getBalance(){
        return ordersService.getBalace().toString();
    }
}
