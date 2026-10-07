/**
 * builds the house in-program from values passed in from another class
 */
public class House {
    String addy;
    int price;
    int area;
    int numBedrooms;
    
    /**
     * constructor of the houses
     * @param address sets the address of the house object 
     * @param price sets the price of the house object
     * @param area sets the area of the house object
     * @param numBedrooms sets the number of bedrooms of the house object 
     */

    House(String address, int price, int area, int numBedrooms) {
        addy = address; this.price = price; this.area = area; this.numBedrooms = numBedrooms;
    }

    /**
     * returns the address of the house object created
     */
    public String getAddress() {return addy;}

    /**
     * returns the price of the house object created
     */
    public int getPrice() {return price;}

    /**
     * returns the square footage of the house object created
     */
    public int getArea () {return area;}

    /**
     * returns the number of bedrooms of the house object created
     */
    public int getNumBedrooms() {return numBedrooms;}

    /**
     * logic method that determines if the house object being called on satisfies the criteria set by the user
     * @param Criteria the object with the fields that contain what house the user is searching for 
     */
    public boolean satisfies(Criteria c) { 
        Boolean satisfies = true;
        if (price < c.getMinPrice() || price > c.getMaxPrice() || area < c.getMinArea() || area > c.getMaxArea() || numBedrooms < c.getMinBedrooms() || numBedrooms > c.getMaxBedrooms())
        {satisfies = false;}
        return satisfies;
    } 
    
    /**
     * formats the printing of the house object being called on
     */
    @Override
    public String toString() { 
    return addy + " $"+ price + " " + area + "f^2 " + numBedrooms + " bedrooms";
    }
}