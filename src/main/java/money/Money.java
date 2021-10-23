package money;

import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode
public class Money {
    private final BigDecimal amount;

    private Money(int amount) {
        this.amount = BigDecimal.valueOf(amount);
    }

    public static Money of(int amount) {
        return new Money(amount);
    }

    public int intValue() {
        return this.amount.intValue();
    }

    public boolean isGreaterThan(Money money) {
        return this.amount.compareTo(money.amount) > 0;
    }

    public boolean isGreaterThanOrEqualTo(Money money) {
        return isGreaterThan(money) || isEqualTo(money);
    }

    public boolean isLessThan(Money money) {
        return this.amount.compareTo(money.amount) < 0;
    }

    public boolean isLessThanOrEqualTo(Money money) {
        return isLessThan(money) || isEqualTo(money);
    }

    public boolean isEqualTo(Money money) {
        return this.amount.equals(money.amount);
    }
}
