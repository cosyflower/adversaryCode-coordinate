package rentCarsV1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import rentCarsV1.Avante;
import rentCarsV1.K5;
import rentCarsV1.RentCompany;
import rentCarsV1.Sonata;

public class RentCompanyTest {
    public static final String NEWLINE = System.getProperty("line.separator");

    @Test
    void report() {
        RentCompany rentCompany = RentCompany.create();
        rentCompany.addCar(new Sonata(150.0));
        rentCompany.addCar(new K5(260.0));
        rentCompany.addCar(new Sonata(120.0));
        rentCompany.addCar(new Avante(300.0));
        rentCompany.addCar(new K5(390.0));

        String report = rentCompany.generateReport();
        Assertions.assertThat(report).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터" + NEWLINE
        );

    }
}
