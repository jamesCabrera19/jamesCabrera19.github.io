
import java.io.*;

// this program is writing data to a file using object output
public class Week8PartB {
    public static void main(String[] args) throws IOException {
    	String fileName = "object.dat";
        // creating a file to store objects
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));

        // writing a string to the file
        output.writeUTF("John");

        // writing a double to the file
        output.writeDouble(99.9);

        // writing a date object to the file
        output.writeObject(new java.util.Date());

        // closing the file
        output.close();
        System.out.println("File written as: " + fileName);
    }
}
