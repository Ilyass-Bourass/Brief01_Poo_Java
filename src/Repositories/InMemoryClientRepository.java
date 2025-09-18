package Repositories;
import model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryClientRepository implements ClientRepository {
    private Map<String,User> users;

    public InMemoryClientRepository(){
        users=new HashMap<>();
        User admin = new User("1487", "admin", "a", "a", "admin");
        users.put(admin.getEmail(), admin);
    }

   @Override
    public void addUser(String email , User user){
       users.put(email,user);
    }

    @Override
    public User findByMail(String email){
                return users.get(email);
        }

    @Override
    public User findByUuid(String uuid){
        for (User user : users.values()) {
            if (user.getUuid().equals(uuid)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public Collection<User> findAll(){
        return users.values();
    }
}
