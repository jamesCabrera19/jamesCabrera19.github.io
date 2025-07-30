import java.io.*;

// this program reads data from a file that stores objects
public class Week8PartC {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        // this opens the file that has the stored object
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.txt"));

        // reading a string from the file
        String name = input.readUTF();

        // reading a double from the file
        double score = input.readDouble();

        // reading a date object from the file
        java.util.Date date = (java.util.Date) (input.readObject());

        // printing the result
        System.out.println(name + " " + score + date);
    }
}
