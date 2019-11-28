package hr.java.webshop.controller;

import hr.java.webshop.dao.OrderRepository;
import hr.java.webshop.model.Order;
import hr.java.webshop.pagerduty.IncidentWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    RestTemplate restTemplate;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/narudzba", method = RequestMethod.POST)
    public ResponseEntity<Object> makeOrder(@RequestBody Order order)
    {
        orderRepository.save(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

}
