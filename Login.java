
public class Login {
    
    public static boolean login(Hesap hesap){
        if(hesap.getUserName().equals(hesap.getUserName()) && hesap.getPassword().equals(hesap.getPassword())){
            return true;
        }
        return false;
    }
    
}
