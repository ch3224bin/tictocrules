package coupon;

import org.junit.jupiter.api.Test;
import payment.Payment;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class DayOfWeekConditionTest {

    @Test
    void testIsAvailable() {
        Condition condition = new DayOfWeekCondition(DayOfWeek.MONDAY, DayOfWeek.TUESDAY);
        Payment payment = Payment.builder().dayOfWeek(DayOfWeek.MONDAY).build();
        assertThat(condition.isAvailable(payment)).isTrue();
    }
}
