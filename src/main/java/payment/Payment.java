package payment;

import caretype.CareTypes;
import lombok.Builder;
import lombok.Getter;
import money.Money;

import java.time.DayOfWeek;

@Getter
public class Payment {
    private final Money amount;
    private final CareTypes careTypes;
    private final DayOfWeek dayOfWeek;

    @Builder
    private Payment(Money amount, CareTypes careTypes, DayOfWeek dayOfWeek) {
        this.amount = amount;
        this.careTypes = careTypes;
        this.dayOfWeek = dayOfWeek;
    }
}
