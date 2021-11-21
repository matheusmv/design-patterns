package bridge.java.app.service;

import bridge.java.app.dao.UserDao;
import bridge.java.app.model.User;

public abstract class UserService {

    protected UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public abstract void save(User user);
}
