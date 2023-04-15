package model;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    public static ArrayList getCars (byte n) {
        List<Car> carList = new ArrayList<>();
        if (n >= 1) {carList.add(new Car("VAZ", 2101, "red"));}
        if (n >= 2) {carList.add(new Car("GAZ", 3102, "orange"));}
        if (n >= 3) {carList.add(new Car ("ZAZ", 4103, "yellow"));}
        if (n >= 4) {carList.add(new Car("UAZ", 5104, "green"));}
        if (n >= 5) {carList.add(new Car("KamAZ", 6105, "blue"));}
        return (ArrayList) carList;
    }
}
