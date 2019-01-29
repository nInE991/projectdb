package dznine.projectdb.service;

import dznine.projectdb.config.AppConfig;
import dznine.projectdb.entity.Components;
import dznine.projectdb.repository.ComponentsRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ComponentService {
    @Inject
    AppConfig appConfig;
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

    public List<Components> getAll() {
        return componentsRepository.findAll();
    }

    public List<Components> getByProduct(Integer id) {
        return componentsRepository.findAllByProduct(id);
    }
}
