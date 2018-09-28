package com.example.hp.igbedu;

public class Igbedu {
    /** Title of Track */
    private String nTrackTitle;

    /** Name of Artist */
    private String nArtistName;

    // Drawable resource definition
    private int mImageResourceId;
    private int mPlay;

   /*create Igbedu  object/
   /    @param  Artist Name
   /    @param  Title of Track
   /     @param Song Cover
   // CONSTRUCTOR*/

    public Igbedu(String artistName, String trackTitle, int imageResourceId, int play){
        nArtistName = artistName;
        nTrackTitle = trackTitle;
        mImageResourceId = imageResourceId;
        mPlay = play;
    }

    /*Get Artist Name*/
    public String getTrackTitle(){
        return nTrackTitle;
    }
    /*Get Track Title*/
    public String getArtistName(){
        return nArtistName;
    }
    /* Get the image resource*/
    public int getImageResourceId() {return mImageResourceId; }
    public int getPlay(){return mPlay;}

}
