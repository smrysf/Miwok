package com.example.android.miwok1;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok1.Word;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(@NonNull Activity context, ArrayList<Word>words,int colorResourceId) {
            super(context,0, words);
            mColorResourceId = colorResourceId;
        }

        @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {
            View listItemViw = convertView;
            if(listItemViw == null){
                listItemViw =
                        LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
            }
            Word currentWord = getItem(position);


            TextView miwokTextView = (TextView)listItemViw.findViewById(R.id.miwok_text_view);
            miwokTextView.setText(currentWord.getMiwokTranslation());
            ImageView imageView =(ImageView)listItemViw.findViewById(R.id.image);

            TextView defaultTextView = (TextView)listItemViw.findViewById(R.id.default_text_view);
            miwokTextView.setText(currentWord.getMiwokTranslation());
            defaultTextView.setText(currentWord.getDefaultTranslation());
            if(currentWord.hasImage()) {
                imageView.setImageResource(currentWord.getImageResourceId());
                imageView.setVisibility(View.VISIBLE);
            }else{
                imageView.setVisibility(View.GONE);

            }

            View textContainer = listItemViw.findViewById(R.id.text_container);
            int color = ContextCompat.getColor(getContext(), mColorResourceId );
            textContainer.setBackgroundColor(color);

            return listItemViw;
    }
}
