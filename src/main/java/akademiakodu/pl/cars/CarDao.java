package akademiakodu.pl.cars;

import java.util.List;

public interface CarDao {

    List<Car> findAll();

    void addCar(Car car);
}
