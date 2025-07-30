import java.io.*;

// this program splits a file into smaller parts

public class Week8PartD {

    public static void main(String[] args) throws IOException {

        // this checks if the user gives exactly 2 inputs
        if(args.length != 2) {
            System.out.println("Usage: java SourceFile numberOfPieces");
            System.exit(0);
        }

        // opens the input file for reading
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File(args[0])));

        // getting the number of parts to split the file into
        int numberOfPieces = Integer.parseInt(args[1]);

        // printing the size of the input file
        System.out.println("File size: " + input.available() + " bytes");

        // storing the total size of the file
        long fileSize = input.available();

        // calculating the size of each part
        int splitFileSize = (int) Math.ceil(1.0 * fileSize / numberOfPieces);

        // loop that creates each part of the file
        for(int i = 0; i < numberOfPieces; i++) {
            // this creates the output file for the current part
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File(args[0] + "." + i)));


            int value;
            int count = 0;

            // this copies bytes from the input file to the current part
            while(count++ < splitFileSize && (value = input.read()) != -1){
                output.write(value);
            }

            // closing the current output file
            output.close();
        }

        // closing the input file
        input.close();
        System.out.println("File was splitted");
    }
}
