package dznine.projectdb.controller;

import org.springframework.stereotype.Controller;

@Controller
public class OrdersController {
//    @Inject
//    OrdersRepository ordersRepository;
//    @Inject
//    ComponentService componentService;
//    @Inject
//    CounterService counterService;
//    @Inject
//    OrdersService ordersService;
//    @Inject
//    AppConfig appConfig;
//    @GetMapping("/orders")
//    public String index(Model model) {
//        List<Orders> ordersList = ordersRepository.findAll();
//        model.addAttribute("ordersList", ordersList);
//
//        return "/orders/orders";
//    }
//
//    @GetMapping("/orders/buy")
//    public String getbuy(Model model) {
//        model.addAttribute("componentsList", componentService.getAll());
//        model.addAttribute("counterList", counterService.getAll());
//        return "/orders/buyindex";
//    }
//    @PostMapping("/orders/buy/add")
//    public ResponseEntity addbuy(@RequestParam("compid") Integer componentsid, @RequestParam("date")String date,
//                                 @RequestParam("countid") Integer counterid,@RequestParam("count") Integer count,
//                                 Double price,@RequestParam("note") String note) {
//        appConfig.logger().info(note);
//        if (price * count > ordersService.getBalace()) {
//            return ResponseEntity.status(404).build();
//        } else {
//        Orders order = new Orders();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        Date dateStr = new Date();
//        try {
//            dateStr = formatter.parse(date);
//            ordersService.addBuyOrder(componentsid,dateStr,counterid,price,count,note);
//        }catch (Exception ex){
//
//        }
//
////        Counterparties counterparties = counterService.getbyId(componentsid);
////        Components components = componentService.getComp(componentsid);
////        order.setDate(dateStr);
////        order.setTotal(price * count);
////        order.setCounterparties(counterparties);
////        order.setActions(ordersService.getbyId(2));
////        order.setNote(note);
////        Buy buy = new Buy();
////        buy.setComponents();
////        buy.setCount(count);
////        buy.setPrice(price);
////        buy.setOrders(ordersService.save(order));
////        Logs logs = new Logs();
////        logs.setDate(dateStr);
////        logs.setComponents();
//    }
//        return ResponseEntity.ok().build();
//    }
//    @DeleteMapping("/orders/delete")
//    public ResponseEntity delete(@RequestParam("id") Integer id){
//        ordersService.DeleteOrders(id);
//        return ResponseEntity.ok().build();
//    }
}
