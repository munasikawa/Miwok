package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn
 * it contains a default translation and a miwok translation for that word
 */

public class Word {
    // default translation of the word
    private String mDefaultTranslation;

    // miwok translation of the word
    private String mMiwokTranslation;

    // creates a word object
    // @param defaultTranslation is the word in a language that the user is already
    // familiar with (such as English)
    // @param miwokTranslation is the word in the miwok language

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // get a default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // get a miwok translation of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}


