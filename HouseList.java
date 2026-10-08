import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
 
/**
 * Holds an ArrayList of House objects read from a file and searches them
 * against a Criteria object.
 *
 * @author theBobo
 * @version October 7, 2026
 */
public class HouseList {
    //------------------------------------------------------------------------
    //All of the houses currently for sale
    private ArrayList<House> houseList = new ArrayList<>();
 
    //------------------------------------------------------------------------
    /**
     * Constructor that reads house data from a file and creates a House object for each entry.
     * @param fileName the name of the file containing the house data
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
        }   catch (FileNotFoundException ex) {System.out.println("file not found");}
    }
 
    //------------------------------------------------------------------------
    /**
     * Builds a string of every house that satisfies the criteria, with a separator after each.
     * @param c the Criteria object holding the limits the user is searching with
     * @return a concatenated string of the details of all houses that satisfy c
     */
    public String getHouses(Criteria c) {
        String viableH = "";
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i).satisfies(c)) {viableH += houseList.get(i) + "\n-----\n"; }
        }
        return viableH;
    }
 
    //------------------------------------------------------------------------
    /**
     * Prints every house that satisfies the criteria to the terminal.
     * @param c the Criteria object holding the limits the user is searching with
     */
    public void printHouses(Criteria c) {System.out.println(getHouses(c));}
    //------------------------------------------------------------------------
}