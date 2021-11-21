package bridge.java.app.service;

import bridge.java.app.dao.UserDao;
import bridge.java.app.model.User;

public class UserRest extends UserService {

    public UserRest(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through Rest Protocol!");
        dao.save(user);
    }
}
