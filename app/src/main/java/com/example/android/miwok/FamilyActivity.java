package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "әpә", R.mipmap.ic_launcher));
        words.add(new Word("mother", "әṭa", R.mipmap.ic_launcher));
        words.add(new Word("son", "angsi", R.mipmap.ic_launcher));
        words.add(new Word("daughter", "tune", R.mipmap.ic_launcher));
        words.add(new Word("older brother", "taachi", R.mipmap.ic_launcher));
        words.add(new Word("younger brother", "chalitti", R.mipmap.ic_launcher));
        words.add(new Word("older sister", "teṭe", R.mipmap.ic_launcher));
        words.add(new Word("younger sister", "kolliti", R.mipmap.ic_launcher));
        words.add(new Word("grandmother ", "ama", R.mipmap.ic_launcher));
        words.add(new Word("grandfather", "paapa", R.mipmap.ic_launcher));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}