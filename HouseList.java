import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * class that creates objects from a file being passed in. 
 */
public class HouseList {
    private ArrayList<House> houseList = new ArrayList<>();

    /**
     * method that takes in data about a set of houses from a file and instantiates house objects from that data
     * @param fileName the file containing house data
     */
    public HouseList(String fileName) {
        try (Scanner fileInput = new Scanner(new File(fileName))) {  
            while (fileInput.hasNext()) 
            {
                String address = fileInput.next();
                int price = fileInput.nextInt();
                int area = fileInput.nextInt();
                int numBedrooms = fileInput.nextInt();
                House h = new House(address, price, area, numBedrooms);
                houseList.add(h);
            }
            fileInput.close();
        }   catch (FileNotFoundException ex) {System.out.println("file not found");}
    }

    /**
     * checks the houses objects created to see if they satisfy the criteria passed in from the user
     * @param Criteria-object the object with the fields that contain what house the user is searching for 
     */
    public String getHouses(Criteria c) {
        String viableH = "";
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i).satisfies(c)) {viableH += houseList.get(i) + "\n-----\n"; }
        }
        return viableH;
    }

    /**
     * displays the houses that meet the users criteria to the terminal
     */
    public void printHouses(Criteria c) {System.out.println(getHouses(c));}
    
}