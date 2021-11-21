package bridge.java.app;

import bridge.java.app.dao.UserMongoDao;
import bridge.java.app.dao.UserMysqlDao;
import bridge.java.app.dao.UserOracleDao;
import bridge.java.app.dao.UserPostgresDao;
import bridge.java.app.model.User;
import bridge.java.app.service.UserEJB;
import bridge.java.app.service.UserRest;
import bridge.java.app.service.UserService;
import bridge.java.app.service.UserSoap;

public class Program {
    public static void main(String[] args) {

        User user = new User("user", "user@email.com", "passwd");

        UserService userRestOracleService = new UserRest(new UserOracleDao());
        userRestOracleService.save(user);

        UserService userEJBMongoService = new UserEJB(new UserMongoDao());
        userEJBMongoService.save(user);

        UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
        userSoapPostgresService.save(user);

        UserService userRestMysqlService = new UserRest(new UserMysqlDao());
        userRestMysqlService.save(user);
    }
}
