package dznine.projectdb.controller;

import dznine.projectdb.config.AppConfig;
import dznine.projectdb.entity.Logs;
import dznine.projectdb.service.ComponentService;
import dznine.projectdb.service.LogsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.util.Date;

@Controller
public class LogsController {
    @Inject
    AppConfig config;
    @Inject
    ComponentService service;
    @Inject
    LogsService logsService;
    @GetMapping("/logs")
    public String index(Model model) {
        model.addAttribute("logsList", service.getAll());
        return "logs/logs";
    }
    @GetMapping("/logs/{id}")
    public String loglistbycategory(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("component", service.getComp(id));
        model.addAttribute("logsList", logsService.getLogs(id));
        return "logs/logsbyid";
    }

    @GetMapping("/logs/add")
    public String getedit(Model model) {
        model.addAttribute("componentList", service.getAll());
        return "logs/edit";
    }

    @PostMapping("/logs/add")
    public ResponseEntity edit(@RequestParam("id") Integer id, @RequestParam("count") Float count, @RequestParam("note") String note) throws Exception {
        Logs logs = new Logs(new Date(), logsService.getLogsAction(3), service.getComp(id), count, note);
        logsService.save(logs);
        return ResponseEntity.ok().build();
    }
}
