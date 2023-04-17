package model;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    public static ArrayList getCars () {
        List<Car> carList = new ArrayList<>();
            carList.add(new Car("VAZ", 2101, "red"));
            carList.add(new Car("GAZ", 3102, "orange"));
            carList.add(new Car ("ZAZ", 4103, "yellow"));
            carList.add(new Car("UAZ", 5104, "green"));
            carList.add(new Car("KamAZ", 6105, "blue"));
        return (ArrayList) carList;
    }
}
