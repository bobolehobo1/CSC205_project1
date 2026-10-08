/**
 * Holds the search limits a buyer enters (price, area, and bedroom ranges)
 * so other classes can check houses against them.
 *
 * @author theBobo
 * @version October 7, 2026
 */
public class Criteria {
    //------------------------------------------------------------------------
    //Lowest price the buyer will pay
    private int minimumPrice;
    //Highest price the buyer will pay
    private int maximumPrice;
    //Smallest square footage the buyer will accept
    private int minimumArea;
    //Largest square footage the buyer will accept
    private int maximumArea;
    //Fewest bedrooms the buyer will accept
    private int minimumNumberOfBedrooms;
    //Most bedrooms the buyer will accept
    private int maximumNumberOfBedrooms;
 
    //------------------------------------------------------------------------
    /**
     * Constructor that stores the buyer's limits.
     * @param minimumPrice the lowest price the buyer will pay
     * @param maximumPrice the highest price the buyer will pay
     * @param minimumArea the smallest square footage the buyer will accept
     * @param maximumArea the largest square footage the buyer will accept
     * @param minimumNumberOfBedrooms the fewest bedrooms the buyer will accept
     * @param maximumNumberOfBedrooms the most bedrooms the buyer will accept
     */
    public Criteria(int minimumPrice, int maximumPrice, int minimumArea, int maximumArea, int minimumNumberOfBedrooms, int maximumNumberOfBedrooms) {
        this.minimumPrice = minimumPrice;
        this.maximumPrice = maximumPrice;
        this.minimumArea = minimumArea;
        this.maximumArea = maximumArea;
        this.minimumNumberOfBedrooms = minimumNumberOfBedrooms;
        this.maximumNumberOfBedrooms = maximumNumberOfBedrooms;
    }
 
    //------------------------------------------------------------------------
    /** @return the minimum price the user is willing to pay */
    public int getMinPrice() {return minimumPrice;}
 
    /** @return the maximum price the user is willing to pay */
    public int getMaxPrice() {return maximumPrice;}
 
    /** @return the minimum area the user is willing to accept */
    public int getMinArea() {return minimumArea;}
 
    /** @return the maximum area the user is willing to accept */
    public int getMaxArea() {return maximumArea;}
 
    /** @return the minimum number of bedrooms the user is willing to accept */
    public int getMinBedrooms() {return minimumNumberOfBedrooms;}
 
    /** @return the maximum number of bedrooms the user is willing to accept */
    public int getMaxBedrooms() {return maximumNumberOfBedrooms;}
    //------------------------------------------------------------------------
}