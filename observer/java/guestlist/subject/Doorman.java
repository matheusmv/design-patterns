package observer.java.guestlist.subject;

public class Doorman extends Subject {

    private boolean status = false;

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean newStatus) {
        this.status = newStatus;
        super.notifyObservers(newStatus);
    }
}
