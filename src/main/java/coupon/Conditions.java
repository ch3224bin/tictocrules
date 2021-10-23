package coupon;

import payment.Payment;

import java.util.List;

public class Conditions {
    private final List<Condition> conditions;

    public Conditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public boolean isEmpty() {
        return this.conditions.isEmpty();
    }

    public boolean isAvailable(Payment payment) {
        for (Condition condition : conditions) {
            if (!condition.isAvailable(payment)) {
                return false;
            }
        }
        return true;
    }
}
