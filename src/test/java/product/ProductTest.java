package product;

import caretype.CareType;
import caretype.CareTypes;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {
    @Test
    void testCreateProduct() {
        CareTypes careTypes = new CareTypes(CareType.A);
        Product product = new Product(careTypes, DayOfWeek.MONDAY);
        assertThat(product.getCareTypes().contains(CareType.A)).isTrue();
        assertThat(product.getDayOfWeek()).isEqualTo(DayOfWeek.MONDAY);
    }
}
