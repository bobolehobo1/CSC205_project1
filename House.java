/**
 * Represents the details of one house for sale.
 *
 * @author theBobo
 * @version October 7, 2026
 */
public class House {
    //------------------------------------------------------------------------
    //Street address, written as one hyphenated word
    private String address;
    //Asking price
    private int price;
    //Square footage
    private int area;
    //Number of bedrooms
    private int numBedrooms;
 
    //------------------------------------------------------------------------
    /**
     * Constructor of the houses.
     * @param address sets the address of the house object
     * @param price sets the price of the house object
     * @param area sets the area of the house object
     * @param numBedrooms sets the number of bedrooms of the house object
     */
    public House(String address, int price, int area, int numBedrooms) {
        this.address = address;
        this.price = price;
        this.area = area;
        this.numBedrooms = numBedrooms;
    }
 
    //------------------------------------------------------------------------
    /** @return the address of the house */
    public String getAddress() {return address;}
 
    /** @return the price of the house */
    public int getPrice() {return price;}
 
    /** @return the square footage of the house */
    public int getArea() {return area;}
 
    /** @return the number of bedrooms of the house */
    public int getNumBedrooms() {return numBedrooms;}
 
    //------------------------------------------------------------------------
    /**
     * Determines whether this house falls inside all of the limits in the criteria.
     * @param c the Criteria object holding the limits the user is searching with
     * @return true if the house meets the criteria, false otherwise
     */
    public boolean satisfies(Criteria c) {
        boolean satisfies = true;
        if (price < c.getMinPrice() || price > c.getMaxPrice() || area < c.getMinArea() || area > c.getMaxArea() || numBedrooms < c.getMinBedrooms() || numBedrooms > c.getMaxBedrooms())
        {satisfies = false;}
        return satisfies;
    }
 
    //------------------------------------------------------------------------
    /**
     * Creates a printable description of the house.
     * @return the address, price, area, and bedroom count as one string
     */
    @Override
    public String toString() {
        return address + " $" + price + " " + area + "f^2 " + numBedrooms + " bedrooms";
    }
    //------------------------------------------------------------------------
}