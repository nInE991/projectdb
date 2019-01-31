package dznine.projectdb.service;

import dznine.projectdb.entity.*;
import dznine.projectdb.repository.ComponentsBalanceRepository;
import dznine.projectdb.repository.ProductsStructureRepository;
import dznine.projectdb.repository.SalesRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class SalesService {

    @Inject
    SalesRepository salesRepository;
    @Inject
    OrdersBalanceService ordersBalanceService;
    @Inject
    ProductService productService;
    @Inject
    ProductsStructureRepository productsStructureRepository;
    @Inject
    ComponentsBalanceRepository componentsBalanceRepository;
    @Inject
    LogsService logsService;

    public List<Sales> getList() {
        return salesRepository.findAll();
    }

    public void save(Sales sales) throws Exception {
        Products products = sales.getProducts();
        List<ProductStructure> productStructure = productsStructureRepository.findAllbyProducts(products.getId());
        boolean saveindb = true;
        for (int i = 0; i < productStructure.size(); i++) {
            if (productStructure.get(i).getComponents().getComponentBalance().getBalance() <= productStructure.get(i).getCount() * sales.getCount()) {
                saveindb = false;
            }
        }
        Sales sal = salesRepository.save(sales);
        if (saveindb) {
            for (int i = 0; i < productStructure.size(); i++) {
                Logs logs = new Logs(sales.getDate(), logsService.getAction(1), productStructure.get(i).getComponents(), productStructure.get(i).getCount() * sales.getCount() * -1.0, "Продажа № " + sal.getId());
                logsService.save(logs);
            }
            salesRepository.save(sales);
            OrdersBalance ordersBalance = ordersBalanceService.getBalance();
            ordersBalance.setBalance(ordersBalance.getBalance() + sales.getTotal());
            ordersBalanceService.saveBalance(ordersBalance);
        } else {
            throw new Exception();
        }

    }
}
