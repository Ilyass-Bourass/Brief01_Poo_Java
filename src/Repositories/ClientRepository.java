package Repositories;
import model.User;

import java.util.Collection;


public interface ClientRepository {
    void addUser(String email ,User user);
    User findByMail(String email);
    User findByUuid(String uuid);
    Collection <User> findAll();
}
