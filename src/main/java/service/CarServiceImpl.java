package service;
import dao.CarDaoImpl;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDaoImpl carDaoImpl;
    @Autowired
    public CarServiceImpl(CarDaoImpl carDaoimpl) {
        this.carDaoImpl = carDaoimpl;
    }

    @Override
    public List<Car> getCars(byte n) {
        return carDaoImpl.getCars(n);
    }
}
