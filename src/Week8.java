import java.io.*;

// this program is copying bytes from one file to another

public class Week8 {

    public static void main(String[] args) throws IOException {

        // checking if the user provided 2 arguments
        if(args.length != 2) {
            System.out.println("Usage: Java copy sourceFile TargetFiler");
            System.exit(0);
        }

        // creating a file object for the source file
        File sourceFile = new File(args[0]);

        // checking if the source file exists
        if(!sourceFile.exists()) {
            System.out.println("File doesnt exists");
            System.exit(0);
        }

        // creating a file object for the target file
        File targetFile = new File(args[1]);

        // checking if the target file already exists
        if(targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(0);
        }

        // opening the source file for reading
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));

        // opening the target file for writing
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));

        int r;
        int numberOfBytesCopied = 0;

        // reading bytes from the source and writing them to the target
        while((r = input.read()) != -1) {
            output.write((byte) r);
            numberOfBytesCopied++;
        }

        // closing both files
        input.close();
        output.close();

        // printing how many bytes were copied
        System.out.println(numberOfBytesCopied + "bytes copied");
    }
}

