package dao;

import model.Car;
import model.CarList;

import java.util.ArrayList;
import java.util.List;

public class CarListDaoImpl implements CarListDao{
    @Override
    public List<Car> getCars(byte n) {
        List<Car> carList = new ArrayList<>();
        if (n > 5) { n = 5; };
        for (byte i = 0; i < n; i++) {
            carList.add((Car) CarList.getCars().get(i));
        }
        return carList;
    }
}
