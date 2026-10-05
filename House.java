
public class House {
    String addy;
    int price;
    int area;
    int numBedrooms;
    
    House(String address, int price, int area, int numBedrooms) {
        addy = address; this.price = price; this.area = area; this.numBedrooms = numBedrooms;
    }

    public String getAddress() {
        return addy;
    }

    public int getPrice() {
        return price;
    }

    public int getArea () {
        return area;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public boolean satisfies(Criteria c) { 
        Boolean satisfies = true;
        if (price < c.getMinPrice() || price > c.getMaxPrice() || area < c.getMinArea() || area > c.getMaxArea() || numBedrooms < c.getMinBedrooms() || numBedrooms > c.getMaxBedrooms())
        {satisfies = false;}
        return satisfies;
    } 
    
    @Override
    public String toString() { 
    return addy + " $"+ price + " " + area + "f^2 " + numBedrooms + " bedrooms";
    }
}