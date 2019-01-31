package dznine.projectdb.controller;

import dznine.projectdb.config.AppConfig;
import dznine.projectdb.entity.Components;
import dznine.projectdb.entity.ProductStructure;
import dznine.projectdb.entity.Products;
import dznine.projectdb.service.ComponentService;
import dznine.projectdb.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@Controller
public class ProductsController {
    @Inject
    ProductService productService;
    @Inject
    ComponentService componentService;
    @Inject
    AppConfig appConfig;
    @GetMapping("/products")
    public String index(Model model) {
        model.addAttribute("productsList", productService.getAll());
        return "/products/index";
    }

    @GetMapping("/products/add")
    public String getadd() {
        return "/products/addpage1";
    }

    @PostMapping("/products/add")
    @ResponseBody
    public Integer add(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("price") Float price) {
        Products products;
        if (id != 0) {
            products = productService.getOne(id);
            products.setName(name);
            products.setPrice(price);
        } else {
            products = new Products(name, price);
        }
        return productService.save(products).getId();
    }

    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable("id") Integer id, Model model) {
        Products products = productService.getOne(id);
        model.addAttribute("id", products.getId());
        model.addAttribute("name", products.getName());
        model.addAttribute("price", products.getPrice());
        return "/products/addpage1";
    }

    @GetMapping("/products/{id}/components")
    public String compAdd(@PathVariable("id") Integer id, Model model) {
        Products products = productService.getOne(id);
        model.addAttribute("id", products.getId());
        model.addAttribute("name", products.getName());
        model.addAttribute("productStructuresList", productService.getallbyProducts(products.getId()));
        model.addAttribute("compList", componentService.getByProduct(id));
        return "/products/addpage2";
    }

    @PostMapping("/products/{id}/components")
    public ResponseEntity addcomponents(@PathVariable("id") Integer id, @RequestParam("id") Integer comp, @RequestParam("count") Double count) {
        Products products = productService.getOne(id);
        Components components = componentService.getComp(comp);
        productService.saveProductStruct(new ProductStructure(products, components, count));
        productService.save(products);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/products/delete")
    public ResponseEntity deleteProducts(@RequestParam("id") Integer id) {
        Products products = productService.getOne(id);
        productService.deletebyId(products.getId());
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/products/components/delete")
    public ResponseEntity deleteProductsComponents(@RequestParam("id") Integer id) {
        productService.deleteStructProduct(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/products/price/{id}", produces = {"application/json"})
    public @ResponseBody
    String getBalance(@PathVariable("id") Integer id) {
        return productService.getOne(id).getPrice().toString();
    }
}
