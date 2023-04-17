package web.dao;

import web.model.Car;
import web.model.CarList;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
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
