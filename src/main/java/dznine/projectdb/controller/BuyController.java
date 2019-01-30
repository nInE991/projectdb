package dznine.projectdb.controller;

import dznine.projectdb.config.AppConfig;
import dznine.projectdb.entity.Buy;
import dznine.projectdb.service.BuyService;
import dznine.projectdb.service.ComponentService;
import dznine.projectdb.service.OrdersBalanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class BuyController {

    @Inject
    AppConfig appConfig;
    @Inject
    BuyService buyService;
    @Inject
    ComponentService componentService;
    @Inject
    OrdersBalanceService ordersBalanceService;

    @GetMapping("/buy")
    public String index(Model model) {
        model.addAttribute("buyList", buyService.getList());
        return "/buy/index";
    }

    @GetMapping("/buy/add")
    public String getadd(Model model) {
        model.addAttribute("componentsList", componentService.getAll());
        return "/buy/add";
    }

    @PostMapping("/buy/add")
    public ResponseEntity add(@RequestParam("id") Integer id, @RequestParam("date") String date,
                              @RequestParam("count") Integer count, @RequestParam("price") Double price) {
        if (price * count > ordersBalanceService.getBalanceDouble()) {
            return ResponseEntity.status(404).build();
        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date dateStr = new Date();
            try {
                dateStr = formatter.parse(date);
                Buy buy = new Buy(dateStr, componentService.getComp(id), count, price, count * price);
                buyService.save(buy);
            } catch (Exception ex) {
                appConfig.logger().warn(ex.getMessage());
            }
        }
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/buy/delete")
    public ResponseEntity delete(@RequestParam("id") Integer id) throws Exception {
        buyService.delete(id);
        return ResponseEntity.ok().build();
    }
}
