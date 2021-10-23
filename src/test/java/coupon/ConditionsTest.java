package coupon;

import org.junit.jupiter.api.Test;

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
        Conditions conditions = new Conditions(List.of(new Condition()));
        assertThat(conditions.isEmpty()).isFalse();
    }
}
