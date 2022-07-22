package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class SonicActivvity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sonic_activvity);

        videoView = (VideoView) findViewById(R.id.vv1);

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sonic));
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}