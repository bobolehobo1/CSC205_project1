import java.util.*;
public class HouseListTester {

    public static void main(String[] args) {
        
        /*
        Specification 2: Your program needs to prompt the user to enter the criteria they want to use to search for houses that they are interested in. In particular,
        the program should prompt the user to enter the following data:
        a. minimum price
        b. maximum price
        c. minimum area (i.e., square footage)
        d. maximum area (i.e., square footage)
        e. minimum number of bedrooms
        f. maximum number of bedrooms
        */
        Scanner sysin = new Scanner(System.in);
        System.out.println("Enter the minimum price you want to pay for a house:");
        int minPrice = sysin.nextInt();
        System.out.println("Enter the maximum price you want to pay for a house:");
        int maxPrice = sysin.nextInt();
        System.out.println("Enter the minimum square footage you need:");
        int minArea = sysin.nextInt();
        System.out.println("Enter the maximum square footage you want:");
        int maxArea = sysin.nextInt();
        System.out.println("Enter the minimum number of bedrooms:");
        int minBedrooms = sysin.nextInt();
        System.out.println("Enter the maximum number of bedrooms:");
        int maxBedrooms = sysin.nextInt();
        System.out.println("");

        /* hard code values 
        minPrice maxPrice minArea maxArea minBed maxBed
        1000     500000   100     5000    0      10	
        1000     100000   500     1200    0      3
        100000   200000   1000    2000    2      3
        200000   300000   1500    4000    3      6
        100000   500000   2500    5000    3      6
        150000   300000   1500    4000    3      6
        100000   200000   2500    5000    4      6
        */

      
        HouseList hl = new HouseList("houses.txt");
        Criteria c = new Criteria(minPrice, maxPrice, minArea, maxArea, minBedrooms, maxBedrooms);
        hl.printHouses(c);
        
    }
}