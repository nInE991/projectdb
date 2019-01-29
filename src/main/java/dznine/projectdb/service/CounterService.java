package dznine.projectdb.service;

import dznine.projectdb.entity.Counterparties;
import dznine.projectdb.repository.CounterpartiesRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class CounterService {
    @Inject
    CounterpartiesRepository counterpartiesRepository;

    public List<Counterparties> getAll() {
        return counterpartiesRepository.findAll();
    }
}
