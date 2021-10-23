package caretype;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CareTypesTest {
    @Test
    void testContains() {
        CareTypes careTypes = new CareTypes(CareType.A, CareType.B);
        assertThat(careTypes.contains(CareType.A)).isTrue();
        assertThat(careTypes.contains(CareType.B)).isTrue();
        assertThat(careTypes.contains(CareType.C)).isFalse();
    }

    @Test
    void testContainsAnyOf() {
        CareTypes careTypes = new CareTypes(CareType.A, CareType.B);
        assertThat(careTypes.containsAnyOf(new CareTypes(CareType.A, CareType.B))).isTrue();
        assertThat(careTypes.containsAnyOf(new CareTypes(CareType.A, CareType.C))).isTrue();
        assertThat(careTypes.containsAnyOf(new CareTypes(CareType.C))).isFalse();
    }
}
