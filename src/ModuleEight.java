import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ModuleEight {

    public static ArrayList<Entry> arrayListFromText(String path) {
        // creating a ArrayList to store clean data
        ArrayList<Entry> list = new ArrayList<>();

        try {
            // opening the file
            File file = new File(path);
            // initiating the scanner
            Scanner scanner = new Scanner(file);

            // loop to scan lines
            while (scanner.hasNextLine()) {
                // accessing the lines - line by line
                String line = scanner.nextLine();

                // check to skip unnecessary data
                if (line.startsWith("##")) {
                    continue;
                }

                // checking the spacing of the line so they can be separated
                int spaceIndex = line.indexOf(" ");
                // if > 0 we have a KEY and Value
                if (spaceIndex > 0) {
                    // cleaning the line a little
                    String key = line.substring(0, spaceIndex).replace("\"", "");
                    String value = line.substring(spaceIndex + 1).trim();
                    // storing the data in the ArrayList with a Entry. - Entry={key:value}
                    list.add(new Entry(key, value));
                }
            }

            // closing the scanner to avoid memory leaks.
            scanner.close();

        } catch (FileNotFoundException e) {
            // handling the exception
            System.out.println("File not found.");
            // printing the error
            e.printStackTrace();
            // returning empty array if error occurs
            return list;
        }

        // returning the ArrayList if successful
        return list;
    }

    // this method is the same as the one above but it uses Arrays[] instead of ArrayLists
    public static Entry[] listFromText(String path) {
        // initiating counter
        int arrayItemCount = 0;

        File file = new File(path);

        // first pass: count entries
        try {
            // initiating the scanner
            Scanner scanner = new Scanner(file);

            // loop to scan lines
            while (scanner.hasNextLine()) {
                // accessing the lines
                String line = scanner.nextLine();
                // check to skip unnecessary lines
                if (line.startsWith("##")) {
                    continue;
                }

                // checking the spacing of the line so they can be separated
                int spaceIndex = line.indexOf(" ");
                if (spaceIndex > 0) {
                    // if the check is successful we add a key so we increase the counter
                    arrayItemCount++;
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
            // returning empty array
            return new Entry[arrayItemCount];
        }

        // if first pass passes, creating a dictionary array with a X amount of items
        Entry[] list = new Entry[arrayItemCount];

        // second pass - filling in the array
        try {
            // initiating the scanner
            Scanner scanner = new Scanner(file);

            // initiating a counter to update the array index
            int counter = 0;

            // loop to print lines
            while (scanner.hasNextLine()) {
                // accessing the lines
                String line = scanner.nextLine();

                // check again, nothing was saved during the first pass
                if (line.startsWith("##")) {
                    continue;
                }

                // checking the spacing of the line so they can be separated
                int spaceIndex = line.indexOf(" ");
                // if > 0 we have a KEY and Value
                if (spaceIndex > 0) {
                    // saving the KEY and values to the array
                    String key = line.substring(0, spaceIndex).replace("\"", "");
                    String value = line.substring(spaceIndex + 1).trim();
                    list[counter++] = new Entry(key, value);
                }
            }

            // closing the scanner to avoid memory leaks
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
            return new Entry[0];
        }

        return list;
    }

    public static void main(String[] args) {
        // accessing the path
        String path = "/Users/james/Downloads/cmudict_0_6.txt";

        // getting a list of Entry (Entry={Key:Value})
        Entry[] list = listFromText(path);

        // ArrayList is the same data as the list[] just different data structure. (I was testing which one was faster)
        // getting an ArrayList of Entry (Entry={Key:Value})
        ArrayList<Entry> arrayList = arrayListFromText(path);

        Scanner usrInput = new Scanner(System.in);
        System.out.println("Target: ");
        // storing the target word in a variable and converting it to UPPERCASE. KEYS are UPPERCASE
        String targetWord = usrInput.nextLine().toUpperCase();

        // starting the search
        BinarySearch res = new BinarySearch(arrayList);
        BinarySearch res2 = new BinarySearch(list);

        // storing the result in a variable
//      Entry result = res.search(targetWord);
        Entry result2 = res.search(targetWord);

        // printing the result
        System.out.println(result2);
    }
}

// binary search class
class BinarySearch {

	// data fields. Both do the same - I was just testing different data structures
    private ArrayList<Entry> listData;
    private Entry[] arrData;

    // ArrayList constructor
    public BinarySearch(ArrayList<Entry> list) {
        this.listData = list;
    }
    // List[] constructor
    public BinarySearch(Entry[] list) {
        this.arrData = list;
    }

    // search method - to determine which data structure to use (ArrayList || List[])
    public Entry search(String target) {
    	// data check 
        if (arrData != null) {
        	return searchArray(arrData, target); // list[] data search
        } else if (listData != null) {
            return searchList(listData, target); // ArrayList data search
        } else {
            throw new IllegalStateException("No data provided.");
        }
    }

    public static Entry searchList(ArrayList<Entry> list, String target) {
        // data fields
    	int left = 0; // starting value
        int right = list.size() - 1; // end value

        // loop
        while (left <= right) {
        	// getting the middle index of the array
            int middle = (left + right) / 2;
            // extracting the middle key
            String middleKey = list.get(middle).getKey();

            // printing possible results
            System.out.println("Comparing: " + target + " with " + middleKey);

            // check
            if (middleKey.equals(target)) {
                // returning the found target
            	return list.get(middle);
            } else if (middleKey.compareTo(target) < 0) {
                // increasing the search to the left or middle left
            	left = middle + 1;
            } else {
            	// decreasing the search to the other half 
                right = middle - 1;
            }
        }

        // if BinarySearch fails - return nothing
        System.out.println("Target not found");
        return null;
    }

    public static Entry searchArray(Entry[] list, String target) {
        // data fields
    	// starting value
    	int left = 0;
    	// end value
        int right = list.length - 1;

        while (left <= right) {
        	// getting the middle index of the array
        	int middle = (left + right) / 2;
        	// extracting the middle key
            String middleKey = list[middle].getKey();

            // comparing possible results
            System.out.println("Comparing: " + target + " with " + middleKey);

            if (middleKey.equals(target)) {
            	// found target
                return list[middle];
            } else if (middleKey.compareTo(target) < 0) {
                // increasing the search to the left or middle left
                left = middle + 1;
            } else {
            	// decreasing the search to the other half 
                right = middle - 1;
            }
        }

        // if BinarySearch fails - return nothing
        System.out.println("Target not found");
        return null;
    }
}

//object class. Entry = {key:value}
class Entry {

	// data fields
	private String key;
	private String value;

	// no-arg constructor
	public Entry() {
		this.key = "";
		this.value = "";
	}

	// overloaded constructor
	public Entry(String key, String value) {
		this.key = key;
		this.value = value;
	}

	// get method for key
	public String getKey() {
		return this.key;
	}

	// get method for value
	public String getValue() {
		return this.value;
	}

	// toString method
	@Override
	public String toString() {
		return key + ": " + value;
	}
}


