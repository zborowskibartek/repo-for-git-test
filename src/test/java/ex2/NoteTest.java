package ex2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteTest {

    @Test
    public void create() {
        Note note = Note.of("Jan Kowalski", 4.5f);
        assertEquals("Jan Kowalski", note.getName());
        assertEquals(4.5f, note.getNote(), 0.01f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNullName() {
        Note.of(null, 4.5f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createEmptyName() {
        Note.of("  ", 4.5f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNoteToLow() {
        Note.of("Jan Kowalski", 1.9f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNoteToHigh() {
        Note.of("Jan Kowalski", 6.1f);
    }
}
