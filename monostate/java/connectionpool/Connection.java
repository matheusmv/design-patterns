package monostate.java.connectionpool;

public class Connection {

    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean status) {
        inUse = status;
    }

    public Object query(String sql) {
        System.out.println("Running '" + sql + "' in Connection " + this);
        return null;
    }
}
