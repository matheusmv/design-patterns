package monostate.java.connectionpool;

import java.util.Optional;

public interface IConnectionPool {

    Optional<Connection> getConnection();

    void leaveConnection(Connection connection);
}
