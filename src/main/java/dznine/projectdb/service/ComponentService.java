package dznine.projectdb.service;

import dznine.projectdb.config.AppConfig;
import dznine.projectdb.entity.Components;
import dznine.projectdb.repository.ComponentsBalanceRepository;
import dznine.projectdb.repository.ComponentsRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class ComponentService {
    @Inject
    AppConfig appConfig;
    @Inject
    ComponentsBalanceRepository componentsBalanceRepository;
    @Inject
    ComponentsRepository componentsRepository;

    public void Delete(Integer id){
        Components components =componentsRepository.getOne(id);
        appConfig.logger().info("delete: "+ components.getName());
        componentsRepository.deleteById(components.getId());
    }
    public Components getComp(Integer id){
        return componentsRepository.getOne(id);
    }
}
