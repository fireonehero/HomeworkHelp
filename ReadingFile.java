// All my imports
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadingFile {
    public static void main(String[] args){
        // Initializing my variables
        int GGTotal = 0;
        int GBTotal = 0;

        // Started a try catch just incase it cant find the file
        try {
            // Connecting to the file, the text file has to be in the same folder as the code though
            File fileI = new File("C:\\Users\\fireo\\OneDrive\\Desktop\\test.txt");
            // Initialized a scanner and set it to connect to a file
            Scanner myReader = new Scanner(fileI);
            //Started a while loop to go over every line in the text file till it sees the line is empty
            while (myReader.hasNextLine()) {
                // Gets the next line in the text file and stores it in a string called data
                String data = myReader.nextLine();
                // Both of these if statements just check if the line of text matches GG or GB and then increments the variables by 1
                if(data.matches("GG")){
                    GGTotal += 1;
                    System.out.println(GGTotal);
                }else if(data.matches("GB")){
                    GBTotal += 1;
                    System.out.println(GBTotal);
                }
            }
            // Closes file
            myReader.close();
            //If something goes it wrong it will say an error occurred then print the error
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
