import org.junit.jupiter.api.Test;

public class WeaknessTest {
    @Test
    void math() {
        double floor = Math.floor(2.57);
        double ceil = Math.ceil(2.57F);
        long round = Math.round(2.57);

        System.out.println("floor = " + floor);
        String format = String.format("%.2f", ceil);
        System.out.println(format);
        System.out.println("round = " + round);
    }

    @Test
    void system_getProperty() {
        String property = System.getProperty("java.version");
        String vendorProperty = System.getProperty("java.vendor");
        String vendorUrl = System.getProperty("java.vendor.url");
        String osName = System.getProperty("os.name");

        System.out.println("vendorUrl = " + vendorUrl);
        System.out.println("vendorProperty = " + vendorProperty);
        System.out.println("property = " + property);
        System.out.println("osName = " + osName);
    }
}
