//Anthony Nguyen, 05/10/2025, Assignment 9
//The purpose of this program is to demonstrate java file creation and editing

import java.io.*; // for exception, file, and all reader classes
import java.util.*;// used for random and scanner

public class Filer {
  public static void main(String[] args) {
    //trys. trys everywhere.
    try {
      //establish file name
      File myObj = new File("numbers.txt");
      //establish randomizer
      Random random = new Random();//using 0-99
      
      if (myObj.createNewFile()) {
        //if file not found in program's curent directory, it will be made
        System.out.println("File created: " + myObj.getName());
        FileWriter file = new FileWriter(myObj);
        for(int i=0; i<10; i++){
          int rando = random.nextInt(100);
          file.write(rando + " ");
        }
        file.close();
      } else {
        System.out.println("File already exits.");
        //if file is found within current directory, it will be appended
        FileWriter file = new FileWriter(myObj, true);
        for(int i=0; i<10; i++){
          int rando = random.nextInt(100);
          file.write(rando + " ");
        }
        file.close();
      }
    } catch (IOException e) {
      //if something goes wrong with the entire process
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    try {
      //if file is found
      File myObj = new File("numbers.txt");
      Scanner file = new Scanner(myObj);
      while (file.hasNextLine()) {
        //file is read
        String data = file.nextLine();
        System.out.println(data);
      }
      file.close();
    } catch (FileNotFoundException e) {
      //not found
      System.out.println("Error: File not found - " + e.getMessage());
    }
    
  }
}