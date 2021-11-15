package one.transfinite.naac.teaching_plan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AttainmentLevelTest {
    @Test
    void testConstructor() {
        AttainmentLevel actualAttainmentLevel = new AttainmentLevel();
        actualAttainmentLevel.setEndRange(10.0);
        actualAttainmentLevel.setId(123L);
        actualAttainmentLevel.setLevel(1L);
        actualAttainmentLevel.setStartRange(10.0);
        assertEquals(10.0, actualAttainmentLevel.getEndRange().doubleValue());
        assertEquals(123L, actualAttainmentLevel.getId().longValue());
        assertEquals(1L, actualAttainmentLevel.getLevel().longValue());
        assertEquals(10.0, actualAttainmentLevel.getStartRange().doubleValue());
        assertEquals("AttainmentLevel(id=123, level=1, startRange=10.0, endRange=10.0)", actualAttainmentLevel.toString());
    }

    @Test
    void testConstructor2() {
        AttainmentLevel actualAttainmentLevel = new AttainmentLevel(123L, 1L, 10.0, 10.0);
        actualAttainmentLevel.setEndRange(10.0);
        actualAttainmentLevel.setId(123L);
        actualAttainmentLevel.setLevel(1L);
        actualAttainmentLevel.setStartRange(10.0);
        assertEquals(10.0, actualAttainmentLevel.getEndRange().doubleValue());
        assertEquals(123L, actualAttainmentLevel.getId().longValue());
        assertEquals(1L, actualAttainmentLevel.getLevel().longValue());
        assertEquals(10.0, actualAttainmentLevel.getStartRange().doubleValue());
        assertEquals("AttainmentLevel(id=123, level=1, startRange=10.0, endRange=10.0)", actualAttainmentLevel.toString());
    }
}

