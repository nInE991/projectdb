package dznine.projectdb.controller;

import dznine.projectdb.entity.ComponentBalance;
import dznine.projectdb.entity.Components;
import dznine.projectdb.entity.Units;
import dznine.projectdb.repository.ComponentsBalanceRepository;
import dznine.projectdb.repository.ComponentsRepository;
import dznine.projectdb.repository.UnitsRepository;
import dznine.projectdb.service.ComponentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@Controller
public class ComponentsController {
    @Inject
    ComponentService componentService;
    @Inject
    ComponentsRepository componentsRepository;
    @Inject
    UnitsRepository unitsRepository;
    @Inject
    ComponentsBalanceRepository balanceRepository;
    @GetMapping("/components")
    public String index(Model model) {
        model.addAttribute("componentsList",componentsRepository.findAll());
        return "/components/index";
    }
    @GetMapping("/components/add")
    public String addpage(Model model) {
        model.addAttribute("unitsList",unitsRepository.findAll());
        return "/components/add";
    }
    @PostMapping("/components/add")
    public ResponseEntity add(@RequestParam("name") String name, @RequestParam("units") Integer unit){
        try {
            Components components = new Components(name,unitsRepository.getOne(unit));
            components.setComponentBalance(balanceRepository.save(new ComponentBalance(Double.valueOf(0))));
            componentsRepository.save(components);
        }catch (Exception ex){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/components/delete")
    public ResponseEntity delete(@RequestParam("id") Integer id){
        componentService.Delete(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/components/{id}")
    public String getComponents(@PathVariable Integer id,Model model){
        model.addAttribute("component",componentService.getComp(id));
        model.addAttribute("unitsList",unitsRepository.findAll());
        return "/components/edit";
    }
    @PostMapping("/components/edit")
    public ResponseEntity edit(@RequestParam("id") Integer id,@RequestParam("name") String name, @RequestParam("units") Integer unit){
        Components components = componentService.getComp(id);
                components.setName(name);
                Units units = unitsRepository.getOne(unit);
                components.setUnits(units);
        componentsRepository.save(components);
        return ResponseEntity.ok().build();
    }

}
