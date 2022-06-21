package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class CinesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cines);

        getSupportActionBar().hide();

        //icono en el actionbar
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setIcon(R.mipmap.ic_launcher);

    }

    //método para enlazar a otros activity
    public void irAInicio(View view){
        Intent objInicio = new Intent(this,MainActivity.class);
        startActivity(objInicio);
    }
    public void irAConfiteria(View view){
        Intent objInicio = new Intent(this,ConfiteriaActivity.class);
        startActivity(objInicio);
    }
    public void irFormatos(View view){
        Intent objInicio = new Intent(this,FormatosActivity.class);
        startActivity(objInicio);
    }
    public void irAPromociones(View view){
        Intent objInicio = new Intent(this,PromoActivity.class);
        startActivity(objInicio);
    }


}