package go.id.kominfo.latihandts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_input_nama, btn_kalkulator,btn_listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_input_nama = findViewById(R.id.btn_input_nama);
        btn_kalkulator = findViewById(R.id.btn_calculator);
        btn_listview = findViewById(R.id.btn_listview);

        btn_input_nama.setOnClickListener(this);
        btn_kalkulator.setOnClickListener(this);
        btn_listview.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.optionmenu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_refresh:
                Toast.makeText(this, "Refresh", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_keluar:
                System.exit(0);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_input_nama:
                    Intent intentInputNama = new Intent(this, InputNamaActivity.class);
                    startActivity(intentInputNama);
                break;
            case R.id.btn_calculator:
                    Intent intentKalkulator = new Intent(this, KalkulatorActivity.class);
                    startActivity(intentKalkulator);
                break;
            case R.id.btn_listview:
                    Intent intentListView = new Intent(this, ListActivity.class);
                    startActivity(intentListView);
                break;
        }
    }


}