package adapter.java.app.core.usecases;

import java.util.List;

import adapter.java.app.core.model.User;
import adapter.java.app.core.ports.UserRepository;

public class UserService {

    private UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void saveUser(User user) {
        boolean alreadyUsedEmail = userRepo.getAll().stream()
                .anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(user.getEmail()));

        if (alreadyUsedEmail)
            throw new RuntimeException("Email address already exists!");

        userRepo.save(user);
    }

    public List<User> getUsers() {
        return userRepo.getAll();
    }
}
