package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class faceActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);
        getSupportActionBar().hide();
        videoView = (VideoView) findViewById(R.id.vv1);

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.face));
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}