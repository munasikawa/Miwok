package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create ArrayList of English Words

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.mipmap.ic_launcher));
        words.add(new Word("two", "otiiko", R.mipmap.ic_launcher));
        words.add(new Word("three", "tolookosu", R.mipmap.ic_launcher));
        words.add(new Word("four", "oyyisa", R.mipmap.ic_launcher));
        words.add(new Word("five", "massokka", R.mipmap.ic_launcher));
        words.add(new Word("six", "temmokka", R.mipmap.ic_launcher));
        words.add(new Word("seven", "kenekaku", R.mipmap.ic_launcher));
        words.add(new Word("eight", "kawinta", R.mipmap.ic_launcher));
        words.add(new Word("nine", "wo'e", R.mipmap.ic_launcher));
        words.add(new Word("ten", "na'aacha", R.mipmap.ic_launcher));

        // Create an (@link ArrayAdapter), whose data source is a list of Strings. The
        //adapter knows how to create Layouts for each item in the list, using the
        //simple_list_item_1.xml layout resource defined in the Android framework
        //This list item layout contains a single {@link TextView}, which the adapter will set to
        //display a single word

        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the View hierarchy of the {@link Activity}
        // There should be a  {@link ListView} with the View Id called list, which is declared in the
        // word_listyout file

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        //{@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}
