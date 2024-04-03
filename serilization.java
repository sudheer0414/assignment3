import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer(1, "John Doe", "1234567890", "123 Street, City");

        // Serialize the Customer object to JavaObject.txt
        serializeCustomer(customer, "JavaObject.txt");

        System.out.println("Customer object serialized successfully.");
    }

    private static void serializeCustomer(Customer customer, String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
