package coupon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CouponTest {

    @DisplayName("쿠폰에 적용된 조건이 없으면 false를 반환한다")
    @Test
    public void testHasNotConditions() {
        Coupon coupon = new Coupon(new Conditions(Collections.emptyList()));
        assertThat(coupon.hasConditions()).isFalse();
    }

    @DisplayName("쿠폰에 적용된 조건이 있으면 true를 반환한다")
    @Test
    public void testHasConditions() {
        Coupon coupon = new Coupon(new Conditions(List.of(payment -> false)));
        assertThat(coupon.hasConditions()).isTrue();
    }

    @DisplayName("쿠폰에 적용된 조건이 없을 때는 쿠폰을 사용할 수 있다")
    @Test
    void testGivenNoConditionWhenCheckAvailableThenReturnTrue() {
        Coupon coupon = new Coupon(new Conditions(Collections.emptyList()));
        assertThat(coupon.isAvailable()).isTrue();
    }
}
