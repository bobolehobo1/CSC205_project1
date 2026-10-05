import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class HouseList {
    private ArrayList<House> houseList = new ArrayList<>();


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
        }   catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }

    
    public String getHouses(Criteria c) {
        String viableH = "";
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i).satisfies(c)) {
                viableH += houseList.get(i) + "\n-----\n";
            }
        }
        return viableH;
    }

    
    public void printHouses(Criteria c) {
        System.out.println(getHouses(c));
    }
    
}