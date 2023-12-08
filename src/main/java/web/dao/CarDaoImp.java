package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

      List<Car> carList;
     {
         carList = new ArrayList<>();
         carList.add(new Car(1, "BMW", "black"));
         carList.add(new Car(2, "Audi", "white"));
         carList.add(new Car(3, "Tesla", "green"));
         carList.add(new Car(4, "Koenigsegg", "black"));
         carList.add(new Car(5, "Li Auto", "blue"));
     }

    @Override
    public List<Car> printCarId() {
        return carList;
    }
}
