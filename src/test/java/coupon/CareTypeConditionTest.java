package coupon;

import caretype.CareType;
import caretype.CareTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import payment.Payment;

import static org.assertj.core.api.Assertions.assertThat;

public class CareTypeConditionTest {
    @DisplayName("결제에 설정된 돌봄 타입이 쿠폰에 설정된 돌봄 타입에 포함되면 쿠폰을 사용할 수 있다")
    @Test
    void testIsAvailable() {
        Condition condition = new CareTypeCondition(new CareTypes(CareType.A, CareType.B));
        testIsAvailable(condition, new CareTypes(CareType.A, CareType.C), true);
        testIsAvailable(condition, new CareTypes(CareType.C), false);
    }

    private void testIsAvailable(Condition condition, CareTypes careTypes, boolean result) {
        Payment payment = Payment.builder().careTypes(careTypes).build();
        assertThat(condition.isAvailable(payment)).isEqualTo(result);
    }
}
