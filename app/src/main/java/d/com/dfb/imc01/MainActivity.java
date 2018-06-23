package d.com.dfb.imc01;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.*;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    EditText edtPeso,edtAltura;
    TextView txtimc,txtbajo,txtNormal,txtsobrepeso,txtObesidad1,txtObesidad2,txtObesidad3,txtObesidad4;
    Button btnCalcular, btnBorrar;
    float peso, altura, imc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPeso=(EditText)findViewById(R.id.peso);
        edtAltura=(EditText)findViewById(R.id.altura);
        txtimc=(TextView)findViewById(R.id.imc);
        txtbajo=(TextView)findViewById(R.id.bajopeso);
        txtNormal=(TextView)findViewById(R.id.normal);
        txtsobrepeso=(TextView)findViewById(R.id.sobrepeso);
        txtObesidad1=(TextView)findViewById(R.id.obesidad1);
        txtObesidad2=(TextView)findViewById(R.id.obesidad2);
        txtObesidad3=(TextView)findViewById(R.id.obesidad3);
        txtObesidad4=(TextView)findViewById(R.id.obesidad4);
        btnCalcular=(Button)findViewById(R.id.calcular);
        btnBorrar=(Button)findViewById(R.id.borrar);
        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View arg0) {

                    peso = Float.parseFloat(edtPeso.getText().toString());
                    altura = Float.parseFloat(edtAltura.getText().toString());
                    imc = peso / (altura * altura);
                    txtimc.setText("IMC: " + redondear(imc));
                    borrar();

                    if (imc < 18.5) {
                        txtbajo.setBackgroundColor(Color.parseColor("#000000"));
                        txtbajo.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    if (imc >= 18.5 && imc < 25) {
                        txtNormal.setBackgroundColor(Color.parseColor("#000000"));
                        txtNormal.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    if (imc >= 25 && imc < 30) {
                        txtsobrepeso.setBackgroundColor(Color.parseColor("#000000"));
                        txtsobrepeso.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    if (imc >= 30 && imc < 35) {
                        txtObesidad1.setBackgroundColor(Color.parseColor("#000000"));
                        txtObesidad1.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    if (imc >= 35 && imc < 40) {
                        txtObesidad2.setBackgroundColor(Color.parseColor("#000000"));
                        txtObesidad2.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    if (imc >= 40 && imc < 50) {
                        txtObesidad3.setBackgroundColor(Color.parseColor("#000000"));
                        txtObesidad3.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    if (imc >= 50) {
                        txtObesidad4.setBackgroundColor(Color.parseColor("#000000"));
                        txtObesidad4.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                }

            });

        btnBorrar.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick (View arg0)
                {
                    borrar();
                    edtPeso.setText("");
                    edtAltura.setText("");
                    txtimc.setText("IMC: ");
                }
        });

    }
    public float redondear (float n){
        float res;
        int valor=0;
        valor=(int) (n*100);
        res=(float)valor/100;
        return res;
    }
    public void borrar() {

            txtbajo.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txtbajo.setTextColor(Color.parseColor("#000000"));
            txtNormal.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txtNormal.setTextColor(Color.parseColor("#000000"));
            txtsobrepeso.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txtsobrepeso.setTextColor(Color.parseColor("#000000"));
            txtObesidad1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txtObesidad1.setTextColor(Color.parseColor("#000000"));
            txtObesidad2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txtObesidad2.setTextColor(Color.parseColor("#000000"));
            txtObesidad3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txtObesidad3.setTextColor(Color.parseColor("#000000"));
            txtObesidad4.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txtObesidad4.setTextColor(Color.parseColor("#000000"));
    }

    }

