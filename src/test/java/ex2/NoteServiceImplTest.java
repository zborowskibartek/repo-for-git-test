package ex2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteServiceImplTest {

    private NotesService notesService;
    private static final float EQUALITY_DELTA = 0.01f;

    @Before
    public void before() {
        notesService = NotesServiceImpl.createWith(new NotesStorageMock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_nullNote() {
        notesService.add(null);
    }

    @Test
    public void add() {
        notesService.add(Note.of("Jan Kowalski", 4.5f));
    }

    @Test(expected = IllegalArgumentException.class)
    public void averageOf_null() {
        notesService.averageOf(null);
    }

    @Test
    public void averageOf_nonexistent() {
        assertEquals(0.0f, notesService.averageOf("Maria Curie"), EQUALITY_DELTA);
    }

    @Test
    public void averageOf_existing() {
        notesService.add(Note.of("Jan Kowalski", 4.0f));
        notesService.add(Note.of("Jan Kowalski", 4.0f));
        notesService.add(Note.of("Jan Kowalski", 6.0f));
        notesService.add(Note.of("Jan Kowalski", 6.0f));
        assertEquals(5.0f, notesService.averageOf("Jan Kowalski"), EQUALITY_DELTA);
    }

    @Test
    public void clear() {
        notesService.add(Note.of("Jan Kowalski", 4.0f));
        notesService.add(Note.of("Jan Kowalski", 4.0f));
        assertEquals(4.0f, notesService.averageOf("Jan Kowalski"), EQUALITY_DELTA);
        notesService.clear();
        assertEquals(0.0f, notesService.averageOf("Jan Kowalski"), EQUALITY_DELTA);
    }


}
