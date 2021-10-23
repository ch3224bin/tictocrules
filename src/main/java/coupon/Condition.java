package coupon;

import payment.Payment;

public interface Condition {
    boolean isAvailable(Payment payment);
}
