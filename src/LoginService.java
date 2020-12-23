public class LoginService {
    public boolean login(String name, String password) {
        if ("123".equals(name) && "123".equals(password)) {
            return true;
        } else if ("admin".equals(name) && "admin".equals(password)) {
            return true;
        }
        return false;
    }
}
