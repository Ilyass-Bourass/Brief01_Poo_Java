package services;
import Utils.validationUtils;
import  model.User;
import Repositories.ClientRepository;
import Repositories.InMemoryClientRepository;

import java.util.UUID;

public class AuthService {
    private InMemoryClientRepository clientRepository;

    public AuthService(InMemoryClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }

    public boolean inscription(String fuLLName , String email , String pwd , String Role){
        if(!validationUtils.emailValid(email)){
            System.out.println("email invalide");
            return false;
        }
        if(!validationUtils.passwordValid(pwd)){
            System.out.println("password invalide");
            return false;
        }

        if(clientRepository.findByMail(email) != null){
            System.out.println("email existe");
            return false;
        }
        String id = UUID.randomUUID().toString();
        User user = new User(id, fuLLName, email, pwd, Role);
        clientRepository.addUser(email, user);
        System.out.println("Inscription réussie !");
        return true;

    }

    public void afficherUtilisateurs() {
        for (User user : clientRepository.findAll().values()) {
            System.out.println(user.toString());
        }
    }
}

    
