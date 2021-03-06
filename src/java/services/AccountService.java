package services;

import dataaccess.UserDB;
import models.Role;
import models.User;

public class AccountService {
    
    public User login(String email, String password) {
        UserDB userDB = new UserDB();
        
        try {
            User user = userDB.get(email);
            if (password.equals(user.getPassword())) {
                return user;
            }
        } catch (Exception e) {
        }
        
        return null;
    }
    
    public Role getRole(String email) {
        UserDB userdb = new UserDB();
        User user = userdb.get(email);
        return user.getRole();
    }
}
