package idat.dam1.ec1calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
    }

    public void EscribirSiete(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("7");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void EscribirOcho(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("8");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }

    public void EscribirNueve(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("9");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }

    public void EscribirCuatro(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("4");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void EscribirCinco(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("5");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void EscribirSeis(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("6");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void EscribirUno(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("1");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }

    public void EscribirDos(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("2");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void EscribirTres(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("3");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    public void EscribirCero(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("0");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }
    public void EscribirDecimal(View view){
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("0.");
        }
        else{
            tvResultado.setText(tvResultado.getText() + ".");
        }
    }

    public void LimpiarResultado(View view){
        tvResultado.setText("0");
        float numero1 = 0.0f;
        float numero2 = 0.0f;
        String operacion = "";
    }

    public void OperacionDividir(View view){
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "/";
        tvResultado.setText("0");

    }

    public void OperacionMultiplicar(View view){
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "*";
        tvResultado.setText("0");

    }

    public void OperacionSumar(View view){
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "+";
        tvResultado.setText("0");

    }

    public void OperacionRestar(View view){
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "-";
        tvResultado.setText("0");

    }

    public void OperacionPorcentaje(View view){
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "%";
        tvResultado.setText("0");

    }

    public void OperacionSigno(View view){
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "+/-";
        float result = numero1 * -1;
        tvResultado.setText(result + "");

    }

    public void OperacionResultado(View view){
        numero2 = Float.parseFloat(tvResultado.getText().toString());
        if(operacion.equals("/")){
            if(numero2 == 0.0f){
                tvResultado.setText("0");
                Toast.makeText(this, "ERROR OPREACION NO VALIDA", Toast.LENGTH_LONG).show();
            }else{
                float result = numero1 /numero2;
                tvResultado.setText(result + "");
            }

        }else if(operacion.equals("*")){
            float result = numero1 * numero2;
            tvResultado.setText(result + "");
        }else if(operacion.equals("+")){
            float result = numero1 + numero2;
            tvResultado.setText(result + "");
        }else if(operacion.equals("-")){
            float result = numero1 - numero2;
            tvResultado.setText(result + "");
        }else if(operacion.equals("%")){
            float result = (numero1/100)*numero2;
            tvResultado.setText(result + "");
        }

        float numero1 = 0.0f;
        float numero2 = 0.0f;
        String operacion = "";

    }
}