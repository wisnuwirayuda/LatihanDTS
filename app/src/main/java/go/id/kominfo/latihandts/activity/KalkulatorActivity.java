package go.id.kominfo.latihandts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import go.id.kominfo.latihandts.R;

public class KalkulatorActivity extends AppCompatActivity {

    int txt_kalkulator_input1, txt_kalkulator_input2, txt_kalkulator_jawaban, num1, num2;
    EditText nilai1, nilai2;
    TextView jawaban;
    Button btn_kalkulator_tambah, btn_kalkulator_kurang, btn_kalkulator_bagi, btn_kalkulator_kali, btn_kalkulator_bersihkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        nilai1 = findViewById(R.id.txt_kalkulator_input1);
        nilai2 = findViewById(R.id.txt_kalkulator_input2);
        jawaban = findViewById(R.id.txt_kalkulator_jawaban);
        btn_kalkulator_tambah = findViewById(R.id.btn_kalkulator_tambah);
        btn_kalkulator_kurang = findViewById(R.id.btn_kalkulator_kurang);
        btn_kalkulator_kali = findViewById(R.id.btn_kalkulator_kali);
        btn_kalkulator_bagi = findViewById(R.id.btn_kalkulator_bagi);
        btn_kalkulator_bersihkan = findViewById(R.id.btn_kalkulator_bersihkan);

        btn_kalkulator_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getNumbers()){
                    int jumlah = num1 + num2;
                    jawaban.setText(Integer.toString(jumlah));
                }
            }
        });

        btn_kalkulator_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getNumbers()){
                    int jumlah = num1 - num2;
                    jawaban.setText(Integer.toString(jumlah));
                }
            }
        });

        btn_kalkulator_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getNumbers()){
                    double jumlah = num1 / (num2 * 1.0);
                    jawaban.setText(Double.toString(jumlah));
                }
            }
        });

        btn_kalkulator_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getNumbers()){
                    int jumlah = num1 * num2;
                    jawaban.setText(Integer.toString(jumlah));
                }
            }
        });

        btn_kalkulator_bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai1.getText().clear();
                nilai2.getText().clear();
                jawaban.setText("");
            }
        });
    }

    public boolean getNumbers() {

        // taking input from text box 1
        String s1 = nilai1.getText().toString();

        // taking input from text box 2
        String s2 = nilai2.getText().toString();

        // condition to check if box is not empty
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {

            String result = "Anda belum memasukan angka";
            jawaban.setText(result);

            return false;
        } else {
            // converting string to int.
            num1 = Integer.parseInt(s1);

            // converting string to int.
            num2 = Integer.parseInt(s2);
        }

        return true;
    }
}