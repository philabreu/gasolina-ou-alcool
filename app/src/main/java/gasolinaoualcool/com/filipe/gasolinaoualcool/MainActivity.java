package gasolinaoualcool.com.filipe.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool, precoGasolina;
    private Button botaoCalcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoCalcular = (Button) findViewById(R.id.botaoCalcularId);
        resultado = (TextView) findViewById(R.id.resultadoId);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!precoAlcool.getText().toString().isEmpty() && !precoGasolina.getText().toString().isEmpty()) {

                    Double textoPrecoAlcool = Double.parseDouble(precoAlcool.getText().toString());
                    Double textoPrecoGasolina = Double.parseDouble(precoGasolina.getText().toString());

                    if (textoPrecoAlcool / textoPrecoGasolina >= 0.7) {
                        Toast.makeText(getApplicationContext(), "Melhor utilizar gasolina.", 1).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Melhor utilizar álcool.", 1).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Informe os 2 valores para calcular.", 1).show();
                }
            }
        });
    }
}
