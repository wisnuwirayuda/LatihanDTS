package go.id.kominfo.latihandts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import go.id.kominfo.latihandts.R;

public class InternalStorageActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String FILENAME = "wisnu.txt";
    Button btn_buat, btn_baca, btn_hapus, btn_ubah;
    EditText edtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_internal);

        btn_baca = findViewById(R.id.btn_baca);
        btn_buat = findViewById(R.id.btn_buat);
        btn_hapus = findViewById(R.id.btn_hapus);
        btn_ubah = findViewById(R.id.btn_ubah);
        edtInput = findViewById(R.id.edtInput);

        btn_ubah.setOnClickListener(this);
        btn_hapus.setOnClickListener(this);
        btn_buat.setOnClickListener(this);
        btn_baca.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_baca:
                bacaFile();
                break;
            case R.id.btn_hapus:
                hapusFile();
                break;
            case R.id.btn_ubah:
                ubahFile();
                break;
            case R.id.btn_buat:
                buatFile();
                break;
        }
    }

    void buatFile(){
        String contentData = edtInput.getText().toString();
        File file = new File(getFilesDir(), FILENAME);

        FileOutputStream fileOutputStream = null;

        try {
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(contentData.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
            edtInput.setText("");
            Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show();
        }catch (IOException ex) {
            Toast.makeText(this, "Error: " + ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    void hapusFile(){
        File file = new File(getFilesDir(),FILENAME);
        if (file.exists()) {
            file.delete();
            Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "File Tidak Ditemukan", Toast.LENGTH_SHORT).show();
        }
    }

    void bacaFile() {
        File file = new File(getFilesDir(),FILENAME);
        if (file.exists()){
            StringBuilder text = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = bufferedReader.readLine();

                while (line != null){
                    text.append(line);
                    line = bufferedReader.readLine();
                }
                bufferedReader.close();
                edtInput.setText(text);
            }catch (IOException ex) {
                Toast.makeText(this, "Error: " + ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this, "File Tidak Ditemukan", Toast.LENGTH_SHORT).show();
        }
    }

    void ubahFile() {
        String contentData = edtInput.getText().toString();
        File file = new File(getFilesDir(),FILENAME);

        FileOutputStream fileOutputStream = null;

        try {
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file, false);
            fileOutputStream.write(contentData.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
            edtInput.setText("");
            Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show();
        }catch (IOException ex) {
            Toast.makeText(this, "Error: " + ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}