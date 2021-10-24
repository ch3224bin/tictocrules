package coupon;

import caretype.CareType;
import caretype.CareTypes;
import org.junit.jupiter.api.Test;
import payment.Payment;
import product.Product;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class DayOfWeekConditionTest {

    @Test
    void testIsAvailable() {
        Condition condition = new DayOfWeekCondition(DayOfWeek.MONDAY, DayOfWeek.TUESDAY);
        Product product = new Product(new CareTypes(CareType.A), DayOfWeek.MONDAY);
        Payment payment = Payment.builder().product(product).build();
        assertThat(condition.isAvailable(payment)).isTrue();
    }
}
