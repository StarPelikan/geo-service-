package geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    @Test

    void testCorrectLocation() {
        GeoService geoService = new GeoServiceImpl();
        //Россия
        Country testCountry = Country.RUSSIA;
        Country result = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        //Сравнение  прлученной  IP
        Assertions.assertEquals(testCountry, result);
    }
}


