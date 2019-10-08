package com.example.hodhod.notes.async;

import android.os.AsyncTask;
import android.util.Log;

import com.example.hodhod.notes.models.Note;
import com.example.hodhod.notes.persistence.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note,Void,Void> {

    private static final String TAG = "DeleteAsyncTask";

    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao noteDao) {
        mNoteDao = noteDao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        Log.d(TAG, "doInBackground: thread: " + Thread.currentThread().getName() );
        mNoteDao.delete(notes);
        return null;
    }
}
