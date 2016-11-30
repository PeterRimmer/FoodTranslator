package com.example.peterrimmer.foodtranslator;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class ChineseActivity extends AppCompatActivity {

    ImageView picture ;
    int pictureId;

    public void buttonClick (View view) {

        int id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.peterrimmer.foodtranslator");
        pictureId = getResources().getIdentifier(ourId, "drawable", "com.example.peterrimmer.foodtranslator");

        System.out.println("Button Pressed");
        Log.i("Button tapped",ourId);

        picture.setImageResource(pictureId);
        picture.animate().rotation(360).setDuration(500);
        picture.setClickable(true);
        //picture;

        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();

    }

    public void imageClick (View view) {

        pictureId=0;

        picture.setImageResource(pictureId);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        picture = (ImageView) findViewById(R.id.imageView);

    }
}
