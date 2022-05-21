package com.example.pract_26;

import android.content.Context;
import android.os.AsyncTask;
import android.telephony.TelephonyCallback;
import android.widget.Toast;

public class Async extends AsyncTask<String, Void, Long> {

    Context context;
    DatabaseHandler db;
    long result;

    Async(Context ct) {
        //Connecting the context to Databasehandler.java
        context = ct;
        db = new DatabaseHandler(ct);
    }

    //As name suggest this will be performed in background hence async
    @Override
    protected Long doInBackground(String... strings) {
        //Extracting the strings passed and pushing them to the onInsert method in DatabaseHandler.java
        String name = strings[0];
        String message = strings[1];
        result = db.onInsert(name, message);

        return result;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected  void onPostExecute(Long l) {
        Toast.makeText(context, "Data Inserted!", Toast.LENGTH_SHORT).show();
    }
}
