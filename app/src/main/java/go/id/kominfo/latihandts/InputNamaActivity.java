package go.id.kominfo.latihandts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputNamaActivity extends AppCompatActivity {
    String nama;

    EditText txt_input_nama;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);
        txt_input_nama = findViewById(R.id.txt_input_nama);
        button = findViewById(R.id.btn_simpan);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = txt_input_nama.getText().toString();

                showToast(nama);
            }
        });

    }

    private void showToast(String nama) {
        Toast.makeText(InputNamaActivity.this, nama, Toast.LENGTH_SHORT).show();
    }
}