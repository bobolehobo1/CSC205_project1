/**
 * defines the fields of criteria as described by the user to be passed onto other methods in this package
 */
public class Criteria {
    int minPrice;
    int maxPrice;
    int minArea;
    int maxArea;
    int minBedrooms;
    int maxBedrooms;

    /**
     * constructor for the criteria field to be used in other classes
     * @param minimumPrice sets the minimum price of the house the user is searching for
     * @param maximumPrice sets the minimum price of the house the user is searching for
     * @param minimumArea sets the minimum area of the house the user is searching for
     * @param maximumArea sets the minimum area of the house the user is searching for
     * @param minimumNumberOfBedrooms sets the minimum number of bedrooms in the house the user is searching for
     * @param minimumNumberOfBedrooms sets the minimum number of bedrooms in the house the user is searching for
     */
    Criteria(int minimumPrice, int maximumPrice, int minimumArea, int maximumArea, int minimumNumberOfBedrooms, int maximumNumberOfBedrooms) {
    minPrice = minimumPrice; maxPrice = maximumPrice; minArea = minimumArea; maxArea = maximumArea; minBedrooms = minimumNumberOfBedrooms; maxBedrooms = maximumNumberOfBedrooms;
    }
    /**
     * returns the minimum price the user is willing to pay 
     */
    public int getMinPrice() {return minPrice;}
    /**
     * returns the maximum price the user is willing to pay
     */
    public int getMaxPrice() {return maxPrice;}
    /**
     * returns the minimum area the user is willing to accept
     */
    public int getMinArea() {return minArea;}
    /**
     * returns the maximum area the user is willing to accept
     */
    public int getMaxArea() {return maxArea;}
    /**
     * returns the minimum number of bedrooms the user is willing to accept
     */
    public int getMinBedrooms() {return minBedrooms;}
    /**
     * returns the maximum number of bedrooms the user is willing to accept
     */
    public int getMaxBedrooms() {return maxBedrooms;}
    
}