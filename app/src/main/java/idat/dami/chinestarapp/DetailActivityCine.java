package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivityCine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cine);

        Bundle bundle = getIntent().getExtras();
        String cine = bundle.getString("Cine");

        TextView txvCine = findViewById(R.id.txCine);
        txvCine.setText(cine);


    }
}