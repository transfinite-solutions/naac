package one.transfinite.naac.document;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ParticipantsTest {
    @Test
    void testConstructor() {
        Participants actualParticipants = new Participants();
        actualParticipants.setId(123L);
        actualParticipants.setParticipant("Participant");
        assertEquals(123L, actualParticipants.getId().longValue());
        assertEquals("Participant", actualParticipants.getParticipant());
        assertEquals("Participants(id=123, participant=Participant)", actualParticipants.toString());
    }

    @Test
    void testConstructor2() {
        Participants actualParticipants = new Participants(123L, "Participant");
        actualParticipants.setId(123L);
        actualParticipants.setParticipant("Participant");
        assertEquals(123L, actualParticipants.getId().longValue());
        assertEquals("Participant", actualParticipants.getParticipant());
        assertEquals("Participants(id=123, participant=Participant)", actualParticipants.toString());
    }
}

