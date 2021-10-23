package coupon;

import java.util.List;

public class Conditions {
    private final List<Condition> conditions;

    public Conditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public boolean isEmpty() {
        return this.conditions.isEmpty();
    }
}
