package one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Module8 {
	
	
	
	public static ArrayList<Entry> arrayFromText(){
		
        String path = "/Users/jaimecabrera/Downloads/cmudict_0_6.txt";
        
	    ArrayList<Entry> list = new ArrayList<>();

        
        try {
       	 File file = new File(path);
            Scanner scanner = new Scanner(file);

            // loop to print lines
            while (scanner.hasNextLine()) {
            	// accessing the lines
                String line = scanner.nextLine();
                
                if(line.startsWith("##")) {
                	continue;
                }
                
                int spaceIndex = line.indexOf(" ");
               
                if (spaceIndex > 0) {
                    String key = line.substring(0, spaceIndex).replace("\"", "");
                    String value = line.substring(spaceIndex + 1).trim();
                    list.add( new Entry(key, value));
                }
                
                
                }
            
            scanner.close();
            
       }catch  (FileNotFoundException e){
       	 System.out.println("File not found.");
            // printing the error
            e.printStackTrace();
            
            // returning empty array
            return list;
       }
        
        
	    

		return list;
	}
	
	
	
	
	public static Entry[] textReader( ) {
		// MY LOCAL PATH - UPDATE PATH WITH YOURS
        String path = "/Users/jaimecabrera/Downloads/cmudict_0_6.txt";
       


        int arrayItemCount = 0;
        
        try {
        	 File file = new File(path);
             Scanner scanner = new Scanner(file);

             // loop to print lines
             while (scanner.hasNextLine()) {
             	// accessing the lines
                 String line = scanner.nextLine();
                 
                 if(line.startsWith("##")) {
                 	continue;
                 }
                 
                 int spaceIndex = line.indexOf(" ");
                 if(spaceIndex > 0 ) {
                	 arrayItemCount++;
                	 }
                 }
             
             scanner.close();
             
        }catch  (FileNotFoundException e){
        	 System.out.println("File not found.");
             // printing the error
             e.printStackTrace();
             // returning empty array
             return new Entry[arrayItemCount];
        }
        
        // if first pass passes creating a dictionary array with a X amount of items. 
        Entry[] dictionary = new Entry[arrayItemCount];
        
        
        // second check filling in the array
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            // initiating a counter to update the array index
            int counter = 0;
            
            // loop to print lines
            while (scanner.hasNextLine()) {
            	// accessing the lines
                String line = scanner.nextLine();
                
                if(line.startsWith("##")) {
                	continue;
                }
                
                int spaceIndex = line.indexOf(" ");
                if (spaceIndex > 0) {
                    String key = line.substring(0, spaceIndex).replace("\"", "");
                    String value = line.substring(spaceIndex + 1).trim();
                    dictionary[counter++] = new Entry(key, value);
                }
            }
            
            // closing the scanner to avoid memory leaks
            scanner.close();
            
            // catch exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            // printing error
            e.printStackTrace();
            // returning empty if error array
            return new Entry[0];
        }
        
        return dictionary;
       
        
    }
	
	
	
	
	
	public static void main(String[] args) {
		
		
		String path = "";
//	   Entry[] list = textReader();
	   ArrayList<Entry> arrayList = arrayFromText();

	   System.out.println("Target: ");
	   Scanner usrInput = new Scanner(System.in);
//	   String targetWord = usrInput.nextLine().toUpperCase();
	   String targetWord = "jaime".toUpperCase();	   
	   
	   
	   
	   BinarySearch res = new BinarySearch(arrayList);
	   res.search(targetWord);
	   
//	   System.out.print(res.search(arrayList, targetWord));

	}

}

class BinarySearch {
	
	private ArrayList<Entry> listData;
	private Entry[] arrData;
	
	
	public BinarySearch(ArrayList<Entry> list) {
		this.listData = list;
	}
	public BinarySearch(Entry[] list) {
		this.arrData = list;
	}
	
	
	
	public Entry search(String target) {
        if (arrData != null) {
            return searchArray(arrData, target);
        } else if (listData != null) {
            return searchList(listData, target);
        } else {
            throw new IllegalStateException("No data provided.");
        }
    }
	
	
	
	public static Entry searchList(ArrayList<Entry> list, String target) {
		int left = 0;
		int right = list.size() -1;
		
		 while (left <= right) {			  
			  // calculating the middle of the array
			  int middle = (left + right) /2;
			  String middleKey = list.get(middle).key;
					  

		      System.out.println("Comparing: " + target + " with " + middleKey);


		      if(middleKey.equals(target)) {
//		    	  System.out.println(list.get(middle));
		    	  return list.get(middle);
		      }else if(middleKey.compareTo(target) < 0) {
		    	  left = middle +1;
		      }else {
		    	  right = middle -1;

		      }

		  }
		 return null;
	}
	
	
	public static Entry searchArray(Entry[] list, String target) {
		 int left = 0;
	        int right = list.length - 1;

	        while (left <= right) {
	            int middle = (left + right) / 2;
	            String middleKey = list[middle].key;

	            System.out.println("Comparing: " + target + " with " + middleKey);

	            if (middleKey.equals(target)) {
	                return list[middle];
	            } else if (middleKey.compareTo(target) < 0) {
	                left = middle + 1;
	            } else {
	                right = middle - 1;
	            }
	        }

	        System.out.println("Target not found");
	        return null;

		
		
		
	}
	
}


class Entry {
    String key;
    String value;

    public Entry(String key, String value) {
        this.key = key;
        this.value = value;
    }
    
    public Entry() {
    	this.key="";
    	this.value="";
    }
    
    @Override
    public String toString() {
    	return key + ": " +  value;
    }
    
    
   
    
    
}