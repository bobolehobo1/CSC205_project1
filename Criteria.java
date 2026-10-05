
public class Criteria {
    int minPrice;
    int maxPrice;
    int minArea;
    int maxArea;
    int minBedrooms;
    int maxBedrooms;

    Criteria(int minimumPrice, int maximumPrice, int minimumArea, int maximumArea, int minimumNumberOfBedrooms, int maximumNumberOfBedrooms) {
    minPrice = minimumPrice; maxPrice = maximumPrice; minArea = minimumArea; maxArea = maximumArea; minBedrooms = minimumNumberOfBedrooms; maxBedrooms = maximumNumberOfBedrooms;
    }

    public int getMinPrice() {return minPrice;}

    public int getMaxPrice() {return maxPrice;}

    public int getMinArea() {return minArea;}

    public int getMaxArea() {return maxArea;}

    public int getMinBedrooms() {return minBedrooms;}

    public int getMaxBedrooms() {return maxBedrooms;}
    
}