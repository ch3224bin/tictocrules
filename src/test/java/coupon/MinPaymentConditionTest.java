package coupon;

import money.Money;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import payment.Payment;

import static org.assertj.core.api.Assertions.assertThat;

public class MinPaymentConditionTest {

    private Condition condition;

    @BeforeEach
    void setUp() {
        condition = new MinPaymentCondition(Money.of(1000));
    }

    @DisplayName("결제 금액이 설정된 금액 미만이면 false를 반환한다")
    @Test
    void testIsNotAvailable() {
        Payment payment = Payment.builder().amount(Money.of(999)).build();
        assertThat(condition.isAvailable(payment)).isFalse();
    }

    @DisplayName("결제 금액이 설정된 금액 이상이면 true를 반환한다")
    @Test
    void testIsAvailable() {
        Payment payment = Payment.builder().amount(Money.of(1000)).build();
        assertThat(condition.isAvailable(payment)).isTrue();
        payment = Payment.builder().amount(Money.of(1001)).build();
        assertThat(condition.isAvailable(payment)).isTrue();
    }
}
