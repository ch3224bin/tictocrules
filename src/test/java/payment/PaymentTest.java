package payment;

import caretype.CareType;
import caretype.CareTypes;
import money.Money;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class PaymentTest {
    @Test
    void testCreatePayment() {
        Payment payment = Payment.builder()
                .amount(Money.of(1000))
                .careTypes(new CareTypes(CareType.A, CareType.B))
                .dayOfWeek(DayOfWeek.MONDAY)
                .build();
        assertThat(payment.getAmount()).isEqualTo(Money.of(1000));
        assertThat(payment.getCareTypes().contains(CareType.A)).isTrue();
        assertThat(payment.getDayOfWeek()).isEqualTo(DayOfWeek.MONDAY);
    }
}
