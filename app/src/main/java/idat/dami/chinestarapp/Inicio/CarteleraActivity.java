package idat.dami.chinestarapp.Inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import idat.dami.chinestarapp.AvatarActivity2;
import idat.dami.chinestarapp.JurasicWorl;
import idat.dami.chinestarapp.R;

public class CarteleraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartelera);
    }

    //click para ver los trailers
    /*
    public void startCuarto666(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }
    public void startAsesinosSinMemoria(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }
    public void startCosasAmigos(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }
    public void startLaBestia(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }
    public void startDinoKing(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }
    public void startElvis(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }

    public void startNickJr(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }
    public void startJurasicWorl(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }
    public void startLightyear(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }
    public void startThorAmorYTrueno(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }
    public void startMinions(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }
     */

    public void startAvatar2(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }

    public void startJurasicWorl(View view) {
        Intent objInicio = new Intent(this, JurasicWorl.class);
        startActivity(objInicio);
    }
}