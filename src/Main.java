public class Main {
    public static void main(String[] args) {
        // Two cars with DIFFERENT plates but same brand, model, and year
        Car car1 = new Car("Toyota", "Corolla", 2020, "ABC-123");
        Car car2 = new Car("Toyota", "Corolla", 2020, "XYZ-789");

        System.out.println("car1.equals(car2): " + car1.equals(car2));
        System.out.println("car1.hashCode(): " + car1.hashCode());
        System.out.println("car2.hashCode(): " + car2.hashCode());
        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
    }
}
