package web.service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(byte n) {
        return carDao.getCars(n);
    }
}
