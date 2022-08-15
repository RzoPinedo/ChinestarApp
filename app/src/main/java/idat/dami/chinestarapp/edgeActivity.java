package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class edgeActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edge);
        getSupportActionBar().hide();
        videoView = (VideoView) findViewById(R.id.vv1);

        Uri webPage = Uri.parse("https://drive.google.com/file/d/1P7HzxKVbupzgtVfgaoiVy3IyXAzYllVM/view?usp=sharing");

        //videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.she_hulk));
        //videoView.setVideoURI(Uri.parse("https://youtu.be/R6mIrufS3vI"));

        videoView.setVideoURI(webPage);

        //MediaController mediaController = new MediaController(this);
        //videoView.setMediaController(mediaController);

        videoView.start();
    }

    public void irNewVideo(View view) {
        Uri webPage = Uri.parse("https://youtu.be/R6mIrufS3vI");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webPage);
        startActivity(webIntent);
    }


}