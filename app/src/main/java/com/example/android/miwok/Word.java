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

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    // Drawable resource ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = 0;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
            * Create a new Word object.
            *
            * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
            * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,
                int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    // get a default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // get a miwok translation of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Get the image resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}


