import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {
    private final List<Car> rentedCars;

    public static RentCompany create() {
        return new RentCompany();
    }

    private RentCompany() {
        this.rentedCars = new ArrayList<>();
    }

    public void addCar(Car car) {
        rentedCars.add(car);
    }

    public String generateReport() {
        return rentedCars.stream()
                .map((car) -> car.getName() + " : " + Math.round(car.getChargeQuantity()) + "리터"+ '\n')
                .collect(Collectors.joining());
    }
}
