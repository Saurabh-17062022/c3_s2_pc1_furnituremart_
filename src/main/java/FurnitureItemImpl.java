import java.util.Scanner;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FurnitureItem furnitureItem = new FurnitureItem();
        System.out.println("Enter the usage of furniture Indoor/Outdoor");
        furnitureItem.furnitureUsage = scanner.nextLine();
        System.out.println("Enter color of Furniture red green or blue");
        furnitureItem.color = scanner.nextLine();
        System.out.println("Enter furniture type");
        furnitureItem.furnitureType = scanner.nextLine();
        System.out.println("Enter furniture code");
        furnitureItem.furnitureCode = scanner.nextInt();
        System.out.println("Enter grade Of Furniture from 1 2 3");
        furnitureItem.gradeOfFurniture = scanner.nextInt();
        System.out.println("Enter price of furniture");
        furnitureItem.price = scanner.nextDouble();
        System.out.println("Furniture usage " + "= " + furnitureItem.furnitureUsage);
        System.out.println("Color of Furniture " + "= " + furnitureItem.color);
        System.out.println("Furniture type " + "= " + furnitureItem.furnitureType);
        System.out.println("Furniture code " + "= " + furnitureItem.furnitureCode);
        System.out.println("Furniture grade " + "= " + furnitureItem.gradeOfFurniture);
        System.out.println("Furniture price " + "= " + furnitureItem.price);
        System.out.println("Discount price " + " =" + furnitureItem.calculateDiscount());
    }
}
