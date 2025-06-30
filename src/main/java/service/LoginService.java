package service;

import java.util.List; // ✅ đúng import

import model.cm.User;
import repository.cm.UserRepository;

public class LoginService {

    private UserRepository userRepository = new UserRepository();

    public boolean checkLogin(String username, String password) {
        List<User> list = userRepository.getUserByUsernameAndPassword(username, password);
        return !list.isEmpty(); // rút gọn cú pháp
    }
}
