package jjh.api.user.service;

import jjh.api.user.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//@Deprecated: 사용하지 않음.
@Component
public interface UserService {
    List<User> findAll();
    Optional<User> getById(long id);
    void save(User user);
    boolean existsById(long id);
    long count();
    void deleteById(long id);

}
