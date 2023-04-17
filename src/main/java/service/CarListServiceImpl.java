package service;

import dao.CarListDao;
import dao.CarListDaoImpl;
import model.Car;

import java.util.List;

public class CarListServiceImpl implements CarListService{

    private CarListDao carListDao = new CarListDaoImpl();

    @Override
    public List<Car> getCars(byte n) {
        return carListDao.getCars(n);
    }
}
