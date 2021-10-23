package coupon;

import money.Money;
import org.junit.jupiter.api.Test;
import payment.Payment;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ConditionsTest {

    @Test
    void testIsEmpty() {
        Conditions conditions = new Conditions(Collections.emptyList());
        assertThat(conditions.isEmpty()).isTrue();
    }

    @Test
    void testIsNotEmpty() {
        Conditions conditions = new Conditions(List.of(payment -> false));
        assertThat(conditions.isEmpty()).isFalse();
    }

    @Test
    void testMinPaymentCondition() {
        Conditions conditions = new Conditions(List.of(new MinPaymentCondition(Money.of(1000))));
        Payment payment = Payment.builder().amount(Money.of(1000)).build();
        assertThat(conditions.isAvailable(payment)).isTrue();
        payment = Payment.builder().amount(Money.of(999)).build();
        assertThat(conditions.isAvailable(payment)).isFalse();
    }
}
