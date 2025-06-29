// Main.java
public class Main {
    public static void main(String[] args) {
        // Getting the only object available
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        // Getting the same object again
        Singleton obj2 = Singleton.getInstance();
        obj2.showMessage();

        // Checking if both references point to the same object
        if (obj1 == obj2) {
            System.out.println("Both obj1 and obj2 point to the same Singleton instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
