package product;

import caretype.CareTypes;
import lombok.Getter;

import java.time.DayOfWeek;

@Getter
public class Product {
    private final CareTypes careTypes;
    private final DayOfWeek dayOfWeek;

    public Product(CareTypes careTypes, DayOfWeek dayOfWeek) {
        this.careTypes = careTypes;
        this.dayOfWeek = dayOfWeek;
    }
}
