package Utils;

public class validationUtils {

    public static boolean emailValid(String email){
        return email != null && email.contains("@") && !email.trim().isEmpty();
    }

    public static boolean passwordValid(String pwd){

        return pwd !=null && pwd.length() > 6 ;
    }
}
