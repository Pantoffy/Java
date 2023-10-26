package Exam;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("F523", "Tomato", "Food", 1.5, 589);
        Product product2 = new Product("A763", "Zara shirt", "Appearance", 12.0, 90);
        Product product3 = new Product("H320", "Kitchen table", "Household", 299.0, 13);
        Product product4 = new Product("E092", "iPhone", "Electronic", 1000.0, 4);
        Product product5 = new Product("S108", "Football", "Sport", 19.9, 2);

        System.out.println("Product #1: " + product1);
        System.out.println("Product #2: " + product2);
        System.out.println("Product #3: " + product3);
        System.out.println("Product #4: " + product4);
        System.out.println("Product #5: " + product5);
    }
}
