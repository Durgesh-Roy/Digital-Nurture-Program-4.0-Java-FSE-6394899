// Singleton.java
public class Singleton {
    // Step 1: private static instance of the same class
    private static Singleton instance;

    // Step 2: private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // lazy initialization
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
