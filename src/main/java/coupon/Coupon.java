package coupon;

import payment.Payment;

public class Coupon {
    private final Conditions conditions;

    public Coupon(Conditions conditions) {
        this.conditions = conditions;
    }

    public boolean hasConditions() {
        return !this.conditions.isEmpty();
    }

    public boolean isAvailable(Payment payment) {
        return !this.hasConditions() || this.conditions.isAvailable(payment);
    }
}
