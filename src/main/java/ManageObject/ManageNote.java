package ManageObject;

import AppObject.Note;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Managenote {
    private static ArrayList<Note> ListAllNote = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Managenote(List < Note > ListAllNote) {
            this.ListAllNote = (ArrayList<Note>) ListAllNote;
        }

    public void addNote(Note note) {
        ListAllNote.add(note);
    }

    public void removeNote(Note note) {
        ListAllNote.remove(note);
    }

    public ArrayList<Note> getNotes() {
        return ListAllNote;
    }

    public ArrayList<Note> getSortedNotes() {
        ArrayList<Note> sortedNotes = new ArrayList<>();
        Collections.sort(sortedNotes, (n1, n2) -> n2.getCreated_at().compareTo(n1.getCreated_at()));
        return sortedNotes;
    }

    public List<Note> searchNotes(String note_id) {
        ArrayList<Note> searchedNotes = new ArrayList<>();
        for (Note note : ListAllNote) {
            if (note.getNote_title().contains(note_id) || note.getNote_body().contains(note_id)) {
                searchedNotes.add(note);
            }
        }
        return searchedNotes;
    }

    public String getNoteTemplate(Note note) {
        return String.format("%s\n%s\n%s", note.getNote_title(), note.getNote_body(), note.getCreated_at());
    }

}

