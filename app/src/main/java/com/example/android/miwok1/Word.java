package com.example.android.miwok1;

public class Word {
       private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mResourceImageId = NO_IMAGE_PROVIDED;
      public static final int NO_IMAGE_PROVIDED= -1;
      private int  mResourceAudioId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
                mDefaultTranslation = defaultTranslation;
               mMiwokTranslation = miwokTranslation;
               mResourceAudioId = audioResourceId;
            }
    public Word(String defaultTranslation,
                String miwokTranslation,
                int resourceImageId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceImageId = resourceImageId;
        mResourceAudioId = audioResourceId;


    }

    /**
     * Get the default translation of the word.
     */
           public String getDefaultTranslation() {
                return mDefaultTranslation;
          }

            /**
 +     * Get the Miwok translation of the word.
 +     */
        public String getMiwokTranslation() {
        return mMiwokTranslation;
        }
        public int getImageResourceId(){
            return mResourceImageId;
        }
        public boolean hasImage(){
            return mResourceImageId!= NO_IMAGE_PROVIDED;

        }
        public int getmResourceAudioId(){
            return mResourceAudioId;

        }


}
