package coupon;

import caretype.CareType;
import caretype.CareTypes;
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
        testMinPaymentCondition(conditions, Money.of(1000), true);
        testMinPaymentCondition(conditions, Money.of(999), false);
    }

    private void testMinPaymentCondition(Conditions conditions, Money amount, boolean result) {
        Payment payment = Payment.builder().amount(amount).build();
        assertThat(conditions.isAvailable(payment)).isEqualTo(result);
    }

    @Test
    void testCareTypeCondition() {
        Conditions conditions = new Conditions(List.of(new CareTypeCondition(new CareTypes(CareType.A, CareType.B))));
        testCareTypeCondition(conditions, new CareTypes(CareType.A, CareType.C), true);
        testCareTypeCondition(conditions, new CareTypes(CareType.C), false);
    }

    private void testCareTypeCondition(Conditions conditions, CareTypes careTypes, boolean result) {
        Payment payment = Payment.builder().careTypes(careTypes).build();
        assertThat(conditions.isAvailable(payment)).isEqualTo(result);
    }
}
