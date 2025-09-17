package Repositories;
import model.User;

import java.util.HashMap;
import java.util.Map;

public class InMemoryClientRepository implements ClientRepository {
    private Map<String,User> users;

    public InMemoryClientRepository(){
        users=new HashMap<>();
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
    public Map<String, User> findAll(){
        return users;
    }
}
