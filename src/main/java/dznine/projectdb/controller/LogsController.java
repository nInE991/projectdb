package dznine.projectdb.controller;

import dznine.projectdb.repository.LogsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.inject.Inject;

@Controller
public class LogsController {
    @Inject
    LogsRepository balanceRepository;
    @GetMapping("/logs")
    public String index(Model model) {
        model.addAttribute("logsList",balanceRepository.listLogs());
        return "logs/logs";
    }
    @GetMapping("/logs/{id}")
    public String index(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("logsList");
        return "logs/list";
    }
}
