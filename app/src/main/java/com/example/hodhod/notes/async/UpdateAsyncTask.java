package com.example.hodhod.notes.async;

import android.os.AsyncTask;
import android.util.Log;

import com.example.hodhod.notes.models.Note;
import com.example.hodhod.notes.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note,Void,Void> {

    private static final String TAG = "UpdateAsyncTask";

    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao noteDao) {
        mNoteDao = noteDao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        Log.d(TAG, "doInBackground: thread: " + Thread.currentThread().getName() );
        mNoteDao.update(notes);
        return null;
    }
}
