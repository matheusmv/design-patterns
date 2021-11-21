package adapter.java.app.core.ports;

import java.util.List;

import adapter.java.app.core.model.User;

public interface UserRepository {

    void save(User user);

    List<User> getAll();
}
