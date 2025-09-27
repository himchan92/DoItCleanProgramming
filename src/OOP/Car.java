package OOP;

public class Car {

    String name;
    int price;
    boolean isElectricCar;

    public Car(String name, int price, boolean isElectricCar) {
        this.name = name;
        this.price = price;
        this.isElectricCar = isElectricCar;
    }

    public void printCarInfo() {
        System.out.println("--------------------------------");
        System.out.println("이름: " + this.name);
        System.out.println("가겨: " + this.price);
        if(this.isElectricCar) {
            System.out.println("이차는 전기차");
        }
    }
}
