package HomeWork4Exception;

import java.io.IOException;

public class SimpleException {
    public static void main(String[] args) throws Throwable {
        String name = "Test";
        
        if(name == null) {
            IOException exception = new IOException("TEST");
            throw exception;
        }
        else if (name.length() > 20) {
            Throwable exception2 = new IllegalArgumentException("TEST2");
            throw exception2;
        } else {
            System.out.println("Code work, it's a cool!");
        }
    }
}
