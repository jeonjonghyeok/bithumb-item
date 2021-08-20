package jjh.api.item.controller;

import jjh.api.item.domain.Item;
import jjh.api.order.domain.Order;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {
    @GetMapping
    public List<Item> findAll() {
        return null;
    }

    @GetMapping("/{id")
    public Optional<Item> getById(@PathVariable long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(Item item) {

    }
    @PutMapping
    public void update(Item item){

    }
    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable long id) {
        return false;
    }

    @GetMapping("/count")
    public long count() {
        return 0;
    }

    @DeleteMapping
    public void deleteById(long id) {

    }
}
