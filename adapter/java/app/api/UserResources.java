package adapter.java.app.api;

import java.util.List;
import java.util.Map;

import adapter.java.app.core.model.User;
import adapter.java.app.core.ports.UserRepository;
import adapter.java.app.core.usecases.UserService;
import adapter.java.app.infrastructure.UserMemoryDatabaseAdapter;

public class UserResources {

    private UserService userFacade;

    public UserResources() {
        UserRepository userRepo = new UserMemoryDatabaseAdapter();
        userFacade = new UserService(userRepo);
    }

    public Integer post(Map<String, String> values) {
        try {
            User user = new User(values.get("name"), values.get("email"), values.get("password"));
            userFacade.saveUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 400;
        }
        return 201;
    }

    public Integer get() {
        List<User> users = userFacade.getUsers();
        users.stream().forEach(System.out::println);
        return 200;
    }
}
