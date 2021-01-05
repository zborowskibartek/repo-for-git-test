package ex2;


import com.google.common.base.Preconditions;

import java.util.Collection;

public class NotesServiceImpl implements NotesService {

    private final NotesStorage storageService;

    public NotesServiceImpl(NotesStorage storageService) {
        this.storageService = storageService;
    }

    public static NotesService createWith(NotesStorage storageService) {
        return new NotesServiceImpl(storageService);
    }


    @Override
    public void add(Note note) {
       /* if (note != null) {
            storageService.add(note);
        } else {
            throw new IllegalArgumentException("Note can not be null");
        }*/
        Preconditions.checkArgument(note != null);
        storageService.add(note);
    }

    @Override
    public float averageOf(String name) {
        Preconditions.checkArgument(name != null);
        final Collection<Note> notes = storageService.getAllNotesOf(name);
        float sum = 0.0f;
        if (notes.isEmpty()) {
            return sum;
        } else {
            for (Note note : notes) {
                sum += note.getNote();
            }
            return sum / notes.size();
        }
    }

    @Override
    public void clear() {
        storageService.clear();

    }
}
