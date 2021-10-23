package caretype;

import java.util.Set;

public class CareTypes {
    private final Set<CareType> careTypes;

    public CareTypes(CareType ... careTypes) {
        this.careTypes = Set.of(careTypes);
    }

    public boolean contains(CareType careType) {
        return careTypes.contains(careType);
    }

    public boolean containsAnyOf(CareTypes careTypes) {
        return this.careTypes.stream()
                .anyMatch(careTypes.careTypes::contains);
    }
}
