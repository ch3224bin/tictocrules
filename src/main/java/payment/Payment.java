package payment;

import caretype.CareTypes;
import lombok.Builder;
import lombok.Getter;
import money.Money;

@Getter
public class Payment {
    private final Money amount;
    private final CareTypes careTypes;

    @Builder
    private Payment(Money amount, CareTypes careTypes) {
        this.amount = amount;
        this.careTypes = careTypes;
    }
}
