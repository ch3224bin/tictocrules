package coupon;

import caretype.CareTypes;
import payment.Payment;

public class CareTypeCondition implements Condition {
    private final CareTypes careTypes;

    public CareTypeCondition(CareTypes careTypes) {
        this.careTypes = careTypes;
    }

    @Override
    public boolean isAvailable(Payment payment) {
        return this.careTypes.containsAnyOf(payment.getProduct().getCareTypes());
    }
}
