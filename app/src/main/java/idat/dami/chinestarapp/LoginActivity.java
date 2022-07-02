package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText edUsuario;
    private EditText edPassword;
    private Button btnGrabar;
    private TextView edSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast.makeText(this, "Star-app", Toast.LENGTH_SHORT).show();

        edUsuario = findViewById(R.id.edUsuario);
        edPassword = findViewById(R.id.edPassword);
        btnGrabar = findViewById(R.id.btnIngresar);
        edSaludo = findViewById(R.id.edSaludo);
    }

    public void validarAcceso(View view) {
        String vUsuario = edUsuario.getText().toString();
        String vPassword = edPassword.getText().toString();

        if (vUsuario.isEmpty() && vPassword.isEmpty()) {
            Toast.makeText(this, "Ingrese usuario y password", Toast.LENGTH_LONG).show();
        } else if (vUsuario.isEmpty()) {
            Toast.makeText(this, "Ingrese usuario", Toast.LENGTH_LONG).show();
        } else if (vPassword.isEmpty()) {
            Toast.makeText(this, "Ingrese password", Toast.LENGTH_LONG).show();
        } else if (vUsuario.equals("admin") && vPassword.equals("admin")){
            Toast.makeText(this, "Credenciales válidas", Toast.LENGTH_LONG).show();
            edSaludo.setText("Bienvenido a ChineStarApp");

        } else {
            Toast.makeText(this, "Acceso denegado", Toast.LENGTH_LONG).show();
        }
    }
    //método para enlazar a otros activity
    public void irAInicio(View view) {
        Intent objInicio = new Intent(this, CinesActivity.class);
        startActivity(objInicio);
    }
}