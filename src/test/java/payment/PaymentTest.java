package payment;

import caretype.CareType;
import caretype.CareTypes;
import money.Money;
import org.junit.jupiter.api.Test;
import product.Product;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class PaymentTest {
    @Test
    void testCreatePayment() {
        Product product = new Product(new CareTypes(CareType.A, CareType.B), DayOfWeek.MONDAY);
        Payment payment = Payment.builder()
                .amount(Money.of(1000))
                .product(product)
                .build();
        assertThat(payment.getAmount()).isEqualTo(Money.of(1000));
        assertThat(payment.getProduct()).isEqualTo(product);
    }
}
