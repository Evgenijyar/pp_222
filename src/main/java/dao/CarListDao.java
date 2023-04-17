package dao;

import model.Car;

import java.util.List;

public interface CarListDao {
    public List<Car> getCars (byte n);
}
