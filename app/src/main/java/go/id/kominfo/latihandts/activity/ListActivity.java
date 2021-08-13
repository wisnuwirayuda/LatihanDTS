package go.id.kominfo.latihandts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import go.id.kominfo.latihandts.R;
import go.id.kominfo.latihandts.list.ArabActivity;
import go.id.kominfo.latihandts.list.ArgentinaActivity;
import go.id.kominfo.latihandts.list.AustraliaActivity;
import go.id.kominfo.latihandts.list.BangladeshActivity;
import go.id.kominfo.latihandts.list.BrazilActivity;
import go.id.kominfo.latihandts.list.BruneiActivity;
import go.id.kominfo.latihandts.list.ChinaActivity;
import go.id.kominfo.latihandts.list.DenmarkActivity;
import go.id.kominfo.latihandts.list.FilipinaActivity;
import go.id.kominfo.latihandts.list.GermanyActivity;
import go.id.kominfo.latihandts.list.HondurasActivity;
import go.id.kominfo.latihandts.list.IndiaActivity;
import go.id.kominfo.latihandts.list.IndonesiaActivity;
import go.id.kominfo.latihandts.list.JapanActivity;
import go.id.kominfo.latihandts.list.KoreaActivity;
import go.id.kominfo.latihandts.list.SpainActivity;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new String[]{"Indonesia",
        "China", "Japan", "Korea Selatan", "India", "Brunei Darussalam", "Arab Saudi", "Brazil", "Argentina", "Spain", "Germany", "Australia", "Bangladesh", "Denmark", "Filipina", "Honduras"});
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), IndonesiaActivity.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), ChinaActivity.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), JapanActivity.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), KoreaActivity.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), IndiaActivity.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), BruneiActivity.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), ArabActivity.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), BrazilActivity.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), ArgentinaActivity.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), SpainActivity.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(view.getContext(), GermanyActivity.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(view.getContext(), AustraliaActivity.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(view.getContext(), BangladeshActivity.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(view.getContext(), DenmarkActivity.class);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(view.getContext(), FilipinaActivity.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(view.getContext(), HondurasActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}