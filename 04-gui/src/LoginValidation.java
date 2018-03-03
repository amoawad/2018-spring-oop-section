import java.util.HashMap;
import java.util.Map;

public class LoginValidation {

    Map<String, String> users;

    public LoginValidation() {
        users = new HashMap<>();
        users.put("Ahmed", "1234");
        users.put("Ziko", "1111");
        users.put("Aya", "0000");
    }

    public boolean validate(String username, String password) {
        String retrievedPassword = users.get(username);
        if(retrievedPassword == null) {
            return false;
        } else {
            return password.equals(retrievedPassword);
        }
    }

}
