package dznine.projectdb.controller;

import dznine.projectdb.repository.LogsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.inject.Inject;

@Controller
public class LogsController {
    @Inject
    LogsRepository logsRepository;

    @GetMapping("/logs")
    public String index() {
        logsRepository.findAll();
        return "logs/logs";
    }
}
