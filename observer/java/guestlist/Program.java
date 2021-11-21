package observer.java.guestlist;

import observer.java.guestlist.observers.Friend;
import observer.java.guestlist.observers.Wife;
import observer.java.guestlist.subject.Doorman;

public class Program {
    public static void main(String[] args) {

        Doorman doorman = new Doorman();
        doorman.add(new Wife());
        doorman.add(new Friend());

        System.out.println("Husband is comming");
        doorman.setStatus(true);
    }
}
