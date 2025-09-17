package Repositories;
import model.User;
import java.util.Map;


public interface ClientRepository {
    void addUser(String email ,User user);
    User findByMail(String email);
    User findByUuid(String uuid);
    Map<String,User> findAll();
}
