package OOP;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("벤츠", 13000, true));
        carList.add(new Car("BMW", 6000, false));

        for(Car car : carList) {
            car.printCarInfo();
        }
    }
}
