package singleton.java.connectionpool;

import java.util.Optional;

public class Program {
    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        doQuery3();
    }

    public static void doQuery1() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Optional<Connection> connection = pool.getConnection();

        if (connection.isPresent()) {
            connection.get().query("SELECT * FROM users");
            pool.leaveConnection(connection.get());
        }
    }

    public static void doQuery2() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Optional<Connection> connection = pool.getConnection();

        if (connection.isPresent()) {
            connection.get().query("SELECT * FROM posts");
            pool.leaveConnection(connection.get());
        }
    }

    public static void doQuery3() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Optional<Connection> connection = pool.getConnection();

        if (connection.isPresent()) {
            connection.get().query("SELECT * FROM products");
            pool.leaveConnection(connection.get());
        }
    }
}
