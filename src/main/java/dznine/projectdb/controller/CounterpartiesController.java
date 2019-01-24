package dznine.projectdb.controller;

import dznine.projectdb.entity.Counterparties;
import dznine.projectdb.repository.CounterpartiesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@Controller
public class CounterpartiesController {
    @Inject
    CounterpartiesRepository counterpartiesRepository;

    @GetMapping("/counterparties")
    public String getAll(Model model) {
        model.addAttribute("counterpartiesList", counterpartiesRepository.findAll());
        return "parties/partiescounters";
    }

    @GetMapping("/counterparties/add")
    public String add() {
        return "parties/addparties";
    }

    @PostMapping("/counterparties/add")
    public ResponseEntity adding(@RequestParam("name") String name, @RequestParam("director") String director,
                                 @RequestParam("telephone") String telephone, @RequestParam("address") String address) {
        try {
            Counterparties counterparties = new Counterparties(name, telephone, address, director);
            counterpartiesRepository.save(counterparties);
        } catch (Exception ex) {
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/counterparties/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("counterparties", counterpartiesRepository.findById(id).get());
        return "parties/editparties";
    }

    @DeleteMapping("/counterparties")
    public ResponseEntity getbyId(@RequestParam("id") Integer id) {
        counterpartiesRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }


    @PostMapping("/counterparties/edit")
    public ResponseEntity save(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("director") String director,
                               @RequestParam("telephone") String telephone, @RequestParam("address") String address) {
        try {
            Counterparties counterparties = new Counterparties(Integer.parseInt(id), name, telephone, address, director);
            counterpartiesRepository.save(counterparties);
        } catch (Exception ex) {
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.ok().build();
    }
}
