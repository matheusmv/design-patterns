package monostate.java.connectionpool;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ConnectionPool implements IConnectionPool {

    private static final int POOL_SIZE = 2;
    private static List<Connection> connectionsPool;

    static {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public ConnectionPool() {
        System.out.println("New instance of Connection Pool");
    }

    @Override
    public Optional<Connection> getConnection() {
        Optional<Connection> connection = connectionsPool.stream().filter(conn -> !conn.isInUse()).findFirst();

        if (!connection.isPresent()) {
            System.out.println("No Connections avaiable");
            return Optional.empty();
        }

        connection.get().setInUse(true);

        return connection;
    }

    @Override
    public void leaveConnection(Connection connection) {
        connection.setInUse(false);
    }
}
