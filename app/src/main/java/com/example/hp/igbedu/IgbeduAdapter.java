package com.example.hp.igbedu;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class IgbeduAdapter extends ArrayAdapter {

    private static final String TAG = IgbeduAdapter.class.getSimpleName();

    public IgbeduAdapter(Activity context, ArrayList<Igbedu> tracks) {

        super(context, 0, tracks);
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View listView, @NonNull ViewGroup parent) {
        // Check to inflate the view
     //  View listView = convertView ;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the object located at this position in the list
        Igbedu currentIgbedu;
        currentIgbedu = (Igbedu) getItem(position);

        // Find the Track Title TextView
        TextView trackTextView = listView.findViewById(R.id.track_text_view);
        // set this text on the Track Title TextView
        trackTextView.setText(currentIgbedu.getTrackTitle());
        // Find the Artist Name TextView
        TextView artistTextView = listView.findViewById(R.id.artist_text_view);
        // set this text on the Artist Name TextView
        artistTextView.setText(currentIgbedu.getArtistName());
        // Find the Album Art ImageView
        ImageView artistImage = listView.findViewById(R.id.mak);
        // set this image object on the Artist Name TextView
        artistImage.setImageResource(currentIgbedu.getImageResourceId());
        // Find the Play Image ImageView
        ImageView play = listView.findViewById(R.id.play);
        // set this image object on the Artist Name TextView
        play.setImageResource(currentIgbedu.getPlay());
        return listView;
    }
}
