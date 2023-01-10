package i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test

    void testCorrectMessage() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String testText = "Welcome";
        Assertions.assertEquals(testText, localizationService.locale(Country.USA));
    }
}
