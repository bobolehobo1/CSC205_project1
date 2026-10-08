import java.util.*;
 
/**
 * Interacts with the user: repeatedly prompts for search criteria, creates the
 * matching Criteria objects, and prints the houses that satisfy each one until
 * the user chooses to stop.
 *
 * @author theBobo
 * @version October 7, 2026
 */
public class HouseListTester {
    //------------------------------------------------------------------------
    //The houses currently for sale, read from houses.txt
    private static HouseList availableHouses;
 
    //------------------------------------------------------------------------
    /**
     * Main program: reads the houses once, then keeps reading criteria from the
     * user and printing the matching houses until the user answers anything but "y".
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sysin = new Scanner(System.in);
        availableHouses = new HouseList("houses.txt");
 
        /* test criteria
        minPrice maxPrice minArea maxArea minBed maxBed
        1000     500000   100     5000    0      10
        1000     100000   500     1200    0      3
        100000   200000   1000    2000    2      3
        200000   300000   1500    4000    3      6
        100000   500000   2500    5000    3      6
        150000   300000   1500    4000    3      6
        100000   200000   2500    5000    4      6
        */
 
        int search = 0;
        String again;
        do {
            //------------------------------------------------------------------------
            //user prompting
            System.out.println("Search " + ++search);
            System.out.println("Enter the minimum price, minimum area, and minimum number of bedrooms separated by commas:");
            String[] minCriteria = sysin.nextLine().split("\\s*,\\s*");
            System.out.println("Enter the maximum price, maximum area, and maximum number of bedrooms separated by commas:");
            String[] maxCriteria = sysin.nextLine().split("\\s*,\\s*");
 
            if (minCriteria.length < 3 || maxCriteria.length < 3) {
                System.out.println("Each line needs three values. Skipping this search.\n");
            } else {
                int minPrice = Integer.parseInt(minCriteria[0].trim());
                int minArea = Integer.parseInt(minCriteria[1].trim());
                int minBedrooms = Integer.parseInt(minCriteria[2].trim());
                int maxPrice = Integer.parseInt(maxCriteria[0].trim());
                int maxArea = Integer.parseInt(maxCriteria[1].trim());
                int maxBedrooms = Integer.parseInt(maxCriteria[2].trim());
                System.out.println("");
 
                //------------------------------------------------------------------------
                //object creation and output
                Criteria c = new Criteria(minPrice, maxPrice, minArea, maxArea, minBedrooms, maxBedrooms);


                
                availableHouses.printHouses(c);
                System.out.println("==============================\n");
            }
 
            //------------------------------------------------------------------------
            //ask whether to continue
            System.out.println("Search again? (y/n):");
            again = sysin.nextLine().trim();
            System.out.println("");
        } while (again.equalsIgnoreCase("y"));
 
        sysin.close();
    }
}
 