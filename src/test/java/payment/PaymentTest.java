package payment;

import money.Money;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PaymentTest {
    @Test
    void testCreatePayment() {
        Payment payment = Payment.builder().amount(Money.of(1000)).build();
        assertThat(payment.getAmount()).isEqualTo(Money.of(1000));
    }
}
