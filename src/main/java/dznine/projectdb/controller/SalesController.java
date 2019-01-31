package dznine.projectdb.controller;

import dznine.projectdb.config.AppConfig;
import dznine.projectdb.entity.Sales;
import dznine.projectdb.repository.CounterpartiesRepository;
import dznine.projectdb.repository.ProductsRepository;
import dznine.projectdb.service.SalesService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class SalesController {
    @Inject
    AppConfig appConfig;
    @Inject
    SalesService salesService;
    @Inject
    CounterpartiesRepository counterpartiesRepository;
    @Inject
    ProductsRepository productsRepository;

    @GetMapping("/sales")
    public String index(Model model) {
        model.addAttribute("salesList", salesService.getList());
        return "/sales/index";
    }

    @GetMapping("/sales/add")
    public String getAdd(Model model) {
        model.addAttribute("counterPartiesList", counterpartiesRepository.findAll());
        model.addAttribute("productsList", productsRepository.findAll());
        return "/sales/add";
    }

    @PostMapping("/sales/add")
    public ResponseEntity add(@RequestParam("date") String date, @RequestParam("products") Integer productid,
                              @RequestParam("counterp") Integer counterp, @RequestParam("count") Integer count,
                              @RequestParam("price") Double price) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dateStr = new Date();
        try {
            dateStr = formatter.parse(date);
            Sales sales = new Sales(dateStr, productsRepository.getOne(productid), count, count * price, counterpartiesRepository.findById(counterp).get());
            salesService.save(sales);
        } catch (Exception ex) {
            appConfig.logger().warn(ex.getMessage());
        }
        return ResponseEntity.ok().build();
    }
}
