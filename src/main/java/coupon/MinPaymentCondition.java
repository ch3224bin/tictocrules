package coupon;

import money.Money;
import payment.Payment;

public class MinPaymentCondition implements Condition {
    private final Money minPaymentAmount;

    public MinPaymentCondition(Money minPaymentAmount) {
        this.minPaymentAmount = minPaymentAmount;
    }

    @Override
    public boolean isAvailable(Payment payment) {
        return this.minPaymentAmount.isLessThanOrEqualTo(payment.getAmount());
    }
}
