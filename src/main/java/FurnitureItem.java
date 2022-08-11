public class FurnitureItem {
    String color;
    String furnitureUsage;
    String furnitureType;
    int furnitureCode;
    int gradeOfFurniture;
    double price;

    public FurnitureItem(String color, String furnitureUsage, String furnitureType, int furnitureCode, int gradeOfFurniture, double price) {
        this.color = color;
        this.furnitureUsage = furnitureUsage;
        this.furnitureType = furnitureType;
        this.furnitureCode = furnitureCode;
        this.gradeOfFurniture = gradeOfFurniture;
        this.price = price;
    }

    public FurnitureItem() {

    }

    double calculateDiscount() {
        if (furnitureUsage.equals("Outdoor")) {
            return (price * 5) / 100;
        } else {
            return price;
        }
    }
}
