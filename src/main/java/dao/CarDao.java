package dao;

import model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getCars (byte n);
}
