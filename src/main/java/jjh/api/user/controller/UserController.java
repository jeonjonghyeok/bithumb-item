package jjh.api.user.controller;

import jjh.api.user.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//table명 (꼭 일치하지 않아도 됨.)
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public List<User> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(User user) {

    }
    @PutMapping
    public void update(User user){

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
