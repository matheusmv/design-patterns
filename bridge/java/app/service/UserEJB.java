package bridge.java.app.service;

import bridge.java.app.dao.UserDao;
import bridge.java.app.model.User;

public class UserEJB extends UserService {

    public UserEJB(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through EJB Protocol!");
        dao.save(user);
    }
}
