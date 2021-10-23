package money;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {
    @Test
    void testMoney() {
        int amount = 1000;
        Money money = Money.of(amount);
        assertThat(money.intValue()).isEqualTo(amount);
    }

    @Test
    void testEqual() {
        assertThat(Money.of(1000)).isEqualTo(Money.of(1000));
        assertThat(Money.of(2000)).isEqualTo(Money.of(2000));
    }

    @Test
    void testIsGreaterThan() {
        assertThat(Money.of(1000).isGreaterThan(Money.of(900))).isTrue();
    }

    @Test
    void testIsGreaterThanOrEqualTo() {
        assertThat(Money.of(1000).isGreaterThanOrEqualTo(Money.of(1000))).isTrue();
        assertThat(Money.of(1000).isGreaterThanOrEqualTo(Money.of(999))).isTrue();
    }

    @Test
    void testIsLessThan() {
        assertThat(Money.of(900).isLessThan(Money.of(1000))).isTrue();
    }

    @Test
    void testIsLessThanOrEqualTo() {
        assertThat(Money.of(1000).isLessThanOrEqualTo(Money.of(1000))).isTrue();
        assertThat(Money.of(999).isLessThanOrEqualTo(Money.of(1000))).isTrue();
    }

    @Test
    void testIsEqualTo() {
        assertThat(Money.of(1000).isEqualTo(Money.of(1000))).isTrue();
    }
}
