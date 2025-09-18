    package services;
    import Utils.EspaseConsole;
    import Utils.validationUtils;
    import  model.User;
    import Repositories.InMemoryClientRepository;

    import java.util.UUID;

    public class AuthService {
        private InMemoryClientRepository clientRepository;
        private User currentUser;

        public AuthService(InMemoryClientRepository clientRepository){
            this.clientRepository=clientRepository;
        }

        public User getCurrentUser() {
            return currentUser;
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

        public boolean login(String email , String pwd){
                if(clientRepository.findByMail(email)==null){
                    System.out.println("email n'existe pas");
                    return false;
                }
                if(!clientRepository.findByMail(email).getPassword().equals(pwd)){
                    System.out.println("mot de passe incorrect");
                    return false;
                }
                this.currentUser = clientRepository.findByMail(email);
                System.out.println("Connexion réussie !");
                
                if(clientRepository.findByMail(email).getRole().equals("client")){
                EspaseConsole.espaseClient(currentUser);
                }else {
                    EspaseConsole.espaseAdmin(currentUser);
                }
                return true;
        }

        public void afficherUtilisateurs() {
           clientRepository.findAll().forEach(System.out::println);
        }

    }


