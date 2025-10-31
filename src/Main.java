public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020, "ABC-123");
        Car car2 = new Car("Toyota", "Corolla", 2020, "ABC-123");

        System.out.println("car1.equals(car2): " + car1.equals(car2));
        System.out.println("car1.hashCode(): " + car1.hashCode());
        System.out.println("car2.hashCode(): " + car2.hashCode());
        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
    }
}
