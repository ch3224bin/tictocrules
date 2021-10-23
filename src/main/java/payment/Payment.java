package payment;

import lombok.Builder;
import money.Money;

public class Payment {
    private final Money amount;

    @Builder
    public Payment(Money amount) {
        this.amount = amount;
    }

    public Money getAmount() {
        return this.amount;
    }
}
