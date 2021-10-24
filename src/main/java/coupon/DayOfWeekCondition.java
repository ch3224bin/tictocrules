package coupon;

import payment.Payment;

import java.time.DayOfWeek;
import java.util.Set;

public class DayOfWeekCondition implements Condition {
    private final Set<DayOfWeek> dayOfWeeks;

    public DayOfWeekCondition(DayOfWeek ... dayOfWeeks) {
        this.dayOfWeeks = Set.of(dayOfWeeks);
    }

    @Override
    public boolean isAvailable(Payment payment) {
        return this.dayOfWeeks.contains(payment.getDayOfWeek());
    }
}
