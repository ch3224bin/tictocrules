package payment;

import lombok.Builder;
import lombok.Getter;
import money.Money;
import product.Product;

@Getter
public class Payment {
    private final Money amount;
    private final Product product;

    @Builder
    private Payment(Money amount, Product product) {
        this.amount = amount;
        this.product = product;
    }
}
