package coupon;

public class Coupon {
    private final Conditions conditions;

    public Coupon(Conditions conditions) {
        this.conditions = conditions;
    }

    public boolean hasConditions() {
        return !this.conditions.isEmpty();
    }

    public boolean isAvailable() {
        return !this.hasConditions();
    }
}
