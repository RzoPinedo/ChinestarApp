package idat.dami.chinestarapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;


public class LoginActivity extends AppCompatActivity {
    TextInputLayout usuario;
    TextInputLayout password;
    Button btnIngresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = findViewById(R.id.edUsuario);
        password = findViewById(R.id.edPassword);
        btnIngresar = findViewById(R.id.btnIngresar);
    }

    //método para enlazar a otros activity
    public void irAInicio(View view) {
        Intent objInicio = new Intent(this, CinesActivity.class);
        startActivity(objInicio);
    }

    public void validarAcceso(View view) {
        String vUsuario = usuario.getEditText().getText().toString();
        String vPassword = password.getEditText().getText().toString();

        if (vUsuario.isEmpty() && vPassword.isEmpty()) {
            Toast.makeText(this, "Ingrese usuario y password", Toast.LENGTH_LONG).show();
        } else if (vUsuario.isEmpty()) {
            Toast.makeText(this, "Ingrese usuario", Toast.LENGTH_LONG).show();
        } else if (vPassword.isEmpty()) {
            Toast.makeText(this, "Ingrese password", Toast.LENGTH_LONG).show();
        } else if (vUsuario.equals("admin") && vPassword.equals("admin")) {
            Toast.makeText(this, "Credenciales válidas", Toast.LENGTH_LONG).show();
            Intent objInicio = new Intent(this, MainActivity.class);
            startActivity(objInicio);

        } else {
            Toast.makeText(this, "Acceso denegado", Toast.LENGTH_LONG).show();
        }
    }


}