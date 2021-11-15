package one.transfinite.naac.document;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PhotographTest {
    @Test
    void testConstructor() {
        Photograph actualPhotograph = new Photograph();
        actualPhotograph.setId(123L);
        actualPhotograph.setPhoto("alice.liddell@example.org");
        assertEquals(123L, actualPhotograph.getId().longValue());
        assertEquals("alice.liddell@example.org", actualPhotograph.getPhoto());
        assertEquals("Photograph(id=123, photo=alice.liddell@example.org)", actualPhotograph.toString());
    }

    @Test
    void testConstructor2() {
        Photograph actualPhotograph = new Photograph(123L, "alice.liddell@example.org");
        actualPhotograph.setId(123L);
        actualPhotograph.setPhoto("alice.liddell@example.org");
        assertEquals(123L, actualPhotograph.getId().longValue());
        assertEquals("alice.liddell@example.org", actualPhotograph.getPhoto());
        assertEquals("Photograph(id=123, photo=alice.liddell@example.org)", actualPhotograph.toString());
    }
}

