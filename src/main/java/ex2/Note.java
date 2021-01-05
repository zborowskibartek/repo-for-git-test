package ex2;

import com.google.common.base.Preconditions;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Note implements Serializable {

    private final String name;
    private final float note;

    private Note(String name, float note) {
        Preconditions.checkArgument(name != null, "Student name can not be null!");
        name = name.trim();
        Preconditions.checkArgument(!name.trim().isEmpty(), "Student name can not be empty");
        Preconditions.checkArgument(note >= 2.0f && note <= 6.0f, "Wrong note!");
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public float getNote() {
        return note;
    }

    public static Note of(String name, float note) {
        return new Note(name, note);
    }


}
