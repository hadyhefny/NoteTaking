package com.example.hodhod.notes.persistence;

import android.content.Context;

import com.example.hodhod.notes.async.DeleteAsyncTask;
import com.example.hodhod.notes.async.InsertAsyncTask;
import com.example.hodhod.notes.async.UpdateAsyncTask;
import com.example.hodhod.notes.models.Note;

import java.util.List;

import androidx.lifecycle.LiveData;

public class NoteRepository {

    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {
        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note){
        new InsertAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public void updateNote(Note note){
        new UpdateAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public LiveData<List<Note>> retrieveNotesTask(){

       return mNoteDatabase.getNoteDao().getNotes();
    }


    public void deleteNote(Note note){
        new DeleteAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }
}
