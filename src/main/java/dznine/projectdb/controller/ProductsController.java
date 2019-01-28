package dznine.projectdb.controller;

import dznine.projectdb.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;

@Controller
public class ProductsController {
    @Inject
    ProductService productService;

    @GetMapping("/products")
    public String index(Model model) {
        model.addAttribute("productsList", productService.getAll());
        return "/products/index";
    }

    @GetMapping("/products/add")
    public String getadd() {
        return "/products/add";
    }

    @PostMapping("/products/add")
    public String add(@RequestParam("name") String name, @RequestParam("price") Float price, Model model) {
        model.addAttribute("name", name);
        return "/products/add2";
    }
}
