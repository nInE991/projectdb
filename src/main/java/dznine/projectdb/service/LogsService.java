package dznine.projectdb.service;

import dznine.projectdb.config.AppConfig;
import dznine.projectdb.entity.Actions;
import dznine.projectdb.entity.Logs;
import dznine.projectdb.repository.ActionRepository;
import dznine.projectdb.repository.ComponentsBalanceRepository;
import dznine.projectdb.repository.LogsRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class LogsService {
    @Inject
    LogsRepository logsRepository;
    @Inject
    ActionRepository actionsRepository;
    @Inject
    ComponentsBalanceRepository balanceRepository;
    @Inject
    AppConfig config;

    public List<Logs> getLogs(Integer id) {
        List<Logs> logsList = logsRepository.getByComponents(id);
        return logsList;
    }

    public Actions getAction(Integer id) {
        return actionsRepository.findById(id).get();
    }

    public void save(Logs logs) throws Exception {
        Logs log = logs;
        if (log.getComponents().getComponentBalance().getBalance() + log.getCount() >= 0.0) {
            logsRepository.save(logs);
            log.getComponents().getComponentBalance().setBalance(log.getComponents().getComponentBalance().getBalance() + log.getCount());
            balanceRepository.save(log.getComponents().getComponentBalance());
        } else {
            throw new Exception();
        }

    }

}
