package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (!user.isAuthenticate) return;
        data.add(user);
    }

    public boolean deleteUser(User user) {
        if (user.logOut(user.name, user.password)) {
            return data.remove(user);
        }
//
        return false;
    }

//
}